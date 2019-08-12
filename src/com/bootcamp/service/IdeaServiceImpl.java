package com.bootcamp.service;

import com.bootcamp.model.IdeaDTO;
import com.bootcamp.model.IdeaEntity;
import com.bootcamp.repository.IdeaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class IdeaServiceImpl implements IdeaService {
    @Autowired
    IdeaRepo ideaRepo;

    @Override
    public List<IdeaDTO> getIdeaDTO() {
        return ideaRepo.getIdeaDTO();
    }


    @Override
    public List<IdeaEntity> getIdeaList() {
        return ideaRepo.getIdeaList();
    }

    @Override
    public Map<String,List<IdeaDTO>> getIdeaListbyID(int id) {
        return ideaRepo.getIdeaListbyID(id);
    }

    @Override
    public String postHackathonIdea(int HackathonId) {
        return ideaRepo.postHackathonIdea(HackathonId);
    }

    @Override
    public IdeaDTO editIdea(Integer idea1_id) {
        return ideaRepo.editIdea(idea1_id);
    }

    @Override
    public IdeaDTO editIdeathroughPostman(Integer idea1_id, IdeaDTO ideaDTO) {
        return ideaRepo.editIdeathroughPostman(idea1_id,ideaDTO);
    }

    @Override
    public IdeaDTO likeIdea(Integer idea_id) {
        return ideaRepo.likeIdea(idea_id);
    }
}
