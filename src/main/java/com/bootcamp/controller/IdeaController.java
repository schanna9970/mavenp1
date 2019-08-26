package com.bootcamp.controller;

import com.bootcamp.dto.IdeaDTO;
import com.bootcamp.dto.StatusDTO;
import com.bootcamp.service.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class IdeaController {

    @Autowired
    IdeaService ideaService;

    @GetMapping(value="/IdeaDTO" )
    public List<IdeaDTO> getIdeaDTOList()
    {
        List<IdeaDTO> ideaDTOList=ideaService.getIdeaDTOList();
        return ideaDTOList;
    }

    @GetMapping(path = "/hackathons1/{id}")
    public Map<String, List<IdeaDTO>> getIdeaListbyID(@PathVariable Integer id)
    {
        Map<String,List<IdeaDTO>> idealist1=ideaService.getIdeaListbyID(id);
        return idealist1;
    }

    @PutMapping(path = "/hackathons/likeidea/{idea_id}")
    public IdeaDTO likeIdea(@PathVariable Integer idea_id)
    {
        IdeaDTO ideaDTO=ideaService.likeIdea(idea_id);
        return ideaDTO;
    }

    @PutMapping(path = "/hackathons/ideas/{idea_id}")
    public IdeaDTO editIdea(@PathVariable Integer idea_id,@RequestBody IdeaDTO ideaDTO)
    {
        IdeaDTO ideaDTO1=ideaService.editIdea(idea_id,ideaDTO);
        return ideaDTO1;
    }

    @PostMapping(path = "/hackathons/{hackathonid}/ideas")
    public StatusDTO PosthackathonIdea(@PathVariable int hackathonid,@RequestBody IdeaDTO ideaDTO)
    {
        StatusDTO statusDTO =ideaService.postHackathonIdea(hackathonid,ideaDTO);
        return statusDTO;
    }

}
