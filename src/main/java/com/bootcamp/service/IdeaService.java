package com.bootcamp.service;

import com.bootcamp.dto.IdeaDTO;
import com.bootcamp.dto.StatusDTO;

import java.util.List;
import java.util.Map;

public interface IdeaService {
    List<IdeaDTO> getIdeaDTOList();

    IdeaDTO likeIdea(Integer idea_id);

    Map<String, List<IdeaDTO>> getIdeaListbyID(Integer id1);

    IdeaDTO editIdea(Integer idea_id, IdeaDTO ideaDTO);

    StatusDTO postHackathonIdea(int hackathonid, IdeaDTO ideaDTO);
}
