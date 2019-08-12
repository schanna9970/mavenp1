package com.bootcamp.service;

import com.bootcamp.model.IdeaDTO;
import com.bootcamp.model.IdeaEntity;

import java.util.List;
import java.util.Map;

public interface IdeaService {
    List<IdeaDTO> getIdeaDTO();
    List<IdeaEntity> getIdeaList();
    Map<String,List<IdeaDTO>> getIdeaListbyID(int id);
    String postHackathonIdea(int HackathonId);
    IdeaDTO editIdea(Integer idea1_id);
    IdeaDTO editIdeathroughPostman(Integer idea1_id,IdeaDTO ideaDTO);
    IdeaDTO likeIdea(Integer idea_id);
}
