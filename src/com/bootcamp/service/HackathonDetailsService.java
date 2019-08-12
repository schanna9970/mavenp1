package com.bootcamp.service;

import com.bootcamp.model.HackathonDetailDTO;
import com.bootcamp.model.HackathonDetailsEntity;
import java.util.List;

public interface HackathonDetailsService {
    List<HackathonDetailsEntity> getHackathonDetails();
    List<HackathonDetailDTO> getHackathonDetailsDTO();
   /* List<IdeaDTO> getIdeaDTO();
    List<IdeaEntity> getIdeaList();
    Map<String,List<IdeaDTO>> getIdeaListbyID(int id);
    String postHackathonIdea(int HackathonId);
    IdeaDTO editIdea(Integer idea1_id);
    IdeaDTO editIdeathroughPostman(Integer idea1_id,IdeaDTO ideaDTO);
    IdeaDTO likeIdea(Integer idea_id);*/
}
