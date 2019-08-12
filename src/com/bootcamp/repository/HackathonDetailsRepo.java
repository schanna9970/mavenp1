package com.bootcamp.repository;

import com.bootcamp.model.*;
import java.util.List;

public interface HackathonDetailsRepo
{
     List<HackathonDetailsEntity> getHackathonDetails();
     List<HackathonDetailDTO> getHackathonDetailsDTO();
   /* public List<IdeaDTO> getIdeaDTO();
    public List<IdeaEntity> getIdeaList();
    public Map<String,List<IdeaDTO>> getIdeaListbyID(int id);
    public String postHackathonIdea(int HackathonId);
    IdeaDTO editIdea(Integer idea1_id);
    IdeaDTO editIdeathroughPostman(Integer idea1_id,IdeaDTO ideaDTO);
    IdeaDTO likeIdea(Integer idea_id);*/
}
