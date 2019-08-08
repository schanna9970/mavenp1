package com.bootcamp.service;

import com.bootcamp.model.*;

import java.util.List;
import java.util.Map;

public interface HackathonDetailsService {
    List<HackathonDetailsEntity> getHackathonDetails();
    List<HackathonDetailDTO> getHackathonDetailsDTO();
    List<IdeaDTO> getIdeaDTO();
    List<IdeaEntity> getIdeaList();
    Map<String,List<IdeaDTO>> getIdeaList(int id);
    String postHackathonIdea(int HackathonId);
}
