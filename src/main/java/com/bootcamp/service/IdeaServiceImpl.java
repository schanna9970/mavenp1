package com.bootcamp.service;

import com.bootcamp.dto.IdeaDTO;
import com.bootcamp.dto.StatusDTO;
import com.bootcamp.model.HackathonDetailsEntity;
import com.bootcamp.model.IdeasEntity;
import com.bootcamp.repository.HackathonDetailsRepo;
import com.bootcamp.repository.HackathonIdeaRepo;
import com.bootcamp.transformer.IdeaTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IdeaServiceImpl implements IdeaService {
    @Autowired
    HackathonIdeaRepo ideaRepo;
    @Autowired
    HackathonDetailsRepo hackathonDetailsRepo;
    @Autowired
    IdeaTransform ideaTransform;
    @Autowired
    IdeaDTO ideaDTO;


    @Override
    public List<IdeaDTO> getIdeaDTOList() {
        List<IdeaDTO> ideaDTOList=new ArrayList<>();
        List<IdeasEntity> ideaEntityList;
        ideaEntityList=ideaRepo.findAll();
        for (IdeasEntity ideaEntity1:ideaEntityList)
        {
            ideaDTOList.add(ideaTransform.IdeaEntityToDTO(ideaEntity1)) ;
        }
        return ideaDTOList;
    }

    @Override
    public IdeaDTO likeIdea(Integer idea_id1) {
        IdeasEntity ideaEntity=ideaRepo.findById(idea_id1).get();
        ideaEntity.setIdeaLikes(ideaEntity.getIdeaLikes()+1);
        ideaRepo.save(ideaEntity);
        ideaDTO=ideaTransform.IdeaEntityToDTO(ideaEntity);
       return ideaDTO;
    }

    @Override
    public Map<String, List<IdeaDTO>> getIdeaListbyID(Integer id1) {
        List<IdeaDTO> ideaDTOList=new ArrayList<>();
        HackathonDetailsEntity hackathonDetailsEntity;
        Map<String,List<IdeaDTO>> map=new HashMap<>();
        List<IdeasEntity> ideaEntityList=new ArrayList<>();
        ideaEntityList=ideaRepo.getIdeaEntitiesByIhackathonid(id1);
        hackathonDetailsEntity=hackathonDetailsRepo.findById(id1).get();
        String name=hackathonDetailsEntity.getEventName();
        for (IdeasEntity ideaentity1:ideaEntityList)
        {
            ideaDTOList.add( ideaTransform.IdeaEntityToDTO(ideaentity1) );
        }
        map.put(name,ideaDTOList);
        return map;
    }

    @Override
    public IdeaDTO editIdea(Integer idea_id, IdeaDTO ideaDTO1)
    {
        IdeasEntity ideasEntity=ideaRepo.findById(idea_id).get();
        ideasEntity.setIdeaCategory(ideaDTO1.getIdea_category());
        ideasEntity.setIdeaDetails(ideaDTO1.getIdea_details());
        ideasEntity.setIdeaSummary(ideaDTO1.getIdea_summary());
        ideasEntity.setIdeaTeamMembers(ideaDTO1.getIdea_team_members());
        ideaRepo.save(ideasEntity);
        ideaDTO1.setIhackathon_id(ideasEntity.getIhackathonid());
        ideaDTO1.setIdea_id(idea_id);
        ideaDTO1.setIdea_likes(ideasEntity.getIdeaLikes());
        return ideaDTO1;
    }

    @Override
    public StatusDTO postHackathonIdea(int hackathonid, IdeaDTO ideaDTO) {
        StatusDTO statusDTO=new StatusDTO();
        IdeasEntity ideasEntity=new IdeasEntity();
        ideasEntity.setIdeaTeamMembers(ideaDTO.getIdea_team_members());
        ideasEntity.setIdeaSummary(ideaDTO.getIdea_summary());
        ideasEntity.setIdeaDetails(ideaDTO.getIdea_details());
        ideasEntity.setIdeaCategory(ideaDTO.getIdea_category());
        ideasEntity.setIhackathonid(hackathonid);
        int id=ideaRepo.save(ideasEntity).getIdeaId();
        if(id==0)
        {
            statusDTO.setStatus("Success");
            statusDTO.setMessage("Good");
        }
        else
        {
            statusDTO.setMessage("Failure");
            statusDTO.setStatus("Failure");
        }
        return statusDTO;
    }
}
