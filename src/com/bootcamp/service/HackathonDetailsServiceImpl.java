package com.bootcamp.service;

import com.bootcamp.model.HackathonDetailDTO;
import com.bootcamp.model.HackathonDetailsEntity;
import com.bootcamp.repository.HackathonDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HackathonDetailsServiceImpl implements HackathonDetailsService{
    @Autowired
    HackathonDetailsRepo hackathonDetailsRepo;

    @Override
    public List<HackathonDetailsEntity> getHackathonDetails() {
        return hackathonDetailsRepo.getHackathonDetails();
    }

    @Override
    public List<HackathonDetailDTO> getHackathonDetailsDTO() {return  hackathonDetailsRepo.getHackathonDetailsDTO();}

   /* @Override
    public List<IdeaDTO> getIdeaDTO() {
        return hackathonDetailsRepo.getIdeaDTO();
    }


    @Override
    public List<IdeaEntity> getIdeaList() {
        return hackathonDetailsRepo.getIdeaList();
    }

    @Override
    public Map<String,List<IdeaDTO>> getIdeaListbyID(int id) {
        return hackathonDetailsRepo.getIdeaListbyID(id);
    }

    @Override
    public String postHackathonIdea(int HackathonId) {
        return hackathonDetailsRepo.postHackathonIdea(HackathonId);
    }

    @Override
    public IdeaDTO editIdea(Integer idea1_id) {
        return hackathonDetailsRepo.editIdea(idea1_id);
    }

    @Override
    public IdeaDTO editIdeathroughPostman(Integer idea1_id, IdeaDTO ideaDTO) {
        return hackathonDetailsRepo.editIdeathroughPostman(idea1_id,ideaDTO);
    }

    @Override
    public IdeaDTO likeIdea(Integer idea_id) {
        return hackathonDetailsRepo.likeIdea(idea_id);
    }*/
}
