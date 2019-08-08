package com.bootcamp.repository;

import com.bootcamp.model.*;

import java.util.List;
import java.util.Map;

public interface HackathonDetailsRepo
{
    public List<HackathonDetailsEntity> getHackathonDetails();
    public  List<HackathonDetailDTO> getHackathonDetailsDTO();
    public List<IdeaDTO> getIdeaDTO();
    public List<IdeaEntity> getIdeaList();
    public Map<String,List<IdeaDTO>> getIdeaList(int id);
    public String postHackathonIdea(int HackathonId);
}
