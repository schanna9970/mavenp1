package com.bootcamp.controller;

import com.bootcamp.model.HackathonDetailDTO;
import com.bootcamp.model.HackathonDetailsEntity;
import com.bootcamp.model.IdeaDTO;
import com.bootcamp.model.IdeaEntity;
import com.bootcamp.service.HackathonDetailsService;
import com.bootcamp.service.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {
    @Autowired
    HackathonDetailsService hackathonDetailsService;
    @Autowired
    IdeaService ideaService;

    @GetMapping(path = "/hackathons/{id}")
    public Map<String,List<IdeaDTO>> getIdeaListbyID(@PathVariable int id)
    {
        Map<String,List<IdeaDTO>> idealist1=ideaService.getIdeaListbyID(id);
        return idealist1;
    }

    @PostMapping (path = "/{hackathonid}/ideas")
    public String PosthackathonIdea(@PathVariable int hackathonid)
    {
        String status=ideaService.postHackathonIdea(hackathonid);
        return status;
    }

    @PutMapping(path = "/hackathons/ideas/{idea_id}")
    public IdeaDTO editIdea(@PathVariable Integer idea_id)
    {
        IdeaDTO ideaDTO=ideaService.editIdea(idea_id);
        return ideaDTO;
    }

    @PutMapping(path = "/hackathons/likeidea/{idea_id}")
    public IdeaDTO likeIdea(@PathVariable Integer idea_id)
    {
        IdeaDTO ideaDTO=ideaService.likeIdea(idea_id);
        return ideaDTO;
    }

    @PutMapping(path = "/hackathons/ideas1/{idea_id}")
    public IdeaDTO editIdeathroughPostman(@PathVariable Integer idea_id,@RequestBody IdeaDTO ideaDTO)
    {
        IdeaDTO ideaDTO1=ideaService.editIdeathroughPostman(idea_id,ideaDTO);
        return ideaDTO1;
    }

    @GetMapping(value="/idealist")
    public List<IdeaEntity> getIdeaEntityList(Model model)
    {
        List<IdeaEntity> idealist1=ideaService.getIdeaList();
        return idealist1;
    }

    @GetMapping(value="/hackathonslist" )
    public List<HackathonDetailsEntity> getHackathonsEntityList(Model model )
    {
        List<HackathonDetailsEntity> hackthonDetailsList=hackathonDetailsService.getHackathonDetails();
        return hackthonDetailsList;
    }

    @GetMapping(value="/hackathonsDTO" )
    public List<HackathonDetailDTO> getHackathonsDTOList(Model model )
    {
        List<HackathonDetailDTO> hackthonDetailsList=hackathonDetailsService.getHackathonDetailsDTO();
        return hackthonDetailsList;
    }

    @GetMapping(value="/IdeaDTO" )
    public List<IdeaDTO> getIdeaDTOList(Model model )
    {
        List<IdeaDTO> IdeaDTOList=ideaService.getIdeaDTO();
        return IdeaDTOList;
    }

    @GetMapping(value="/hackathonsthroughJSP" )
    public ModelAndView getdata()
    {
        List<HackathonDetailsEntity> list = hackathonDetailsService.getHackathonDetails();
        ModelAndView model = new ModelAndView("hackathons");
        model.addObject("lists", list);
        return model;
    }

}
