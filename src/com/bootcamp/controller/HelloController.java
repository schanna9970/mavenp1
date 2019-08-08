package com.bootcamp.controller;

import com.bootcamp.model.HackathonDetailDTO;
import com.bootcamp.model.HackathonDetailsEntity;
import com.bootcamp.model.IdeaDTO;
import com.bootcamp.model.IdeaEntity;
import com.bootcamp.service.HackathonDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@RestController
public class HelloController {
    @Autowired
    HackathonDetailsService hackathonDetailsService;

    @GetMapping(path = "/hackathons/{id}")
    public Map<String,List<IdeaDTO>> getData2(@PathVariable int id)
    {
        Map<String,List<IdeaDTO>> idealist1=hackathonDetailsService.getIdeaList(id);
        return idealist1;
    }

    @PostMapping (path = "/{hackathonid}/ideas")
    public String hjhj(@PathVariable int hackathonid)
    {
        String status=hackathonDetailsService.postHackathonIdea(hackathonid);
        return status;
    }

    @GetMapping(value="/idealist")
    public List<IdeaEntity> getData1(Model model)
    {
        List<IdeaEntity> idealist1=hackathonDetailsService.getIdeaList();
        return idealist1;
    }

    @GetMapping(value="/hackathonslist" )
    public List<HackathonDetailsEntity> getData(Model model )
    {
        List<HackathonDetailsEntity> hackthonDetailsList=hackathonDetailsService.getHackathonDetails();
        return hackthonDetailsList;
    }

    @GetMapping(value="/hackathonsDTO" )
    public List<HackathonDetailDTO> getData1111(Model model )
    {
        List<HackathonDetailDTO> hackthonDetailsList=hackathonDetailsService.getHackathonDetailsDTO();
        return hackthonDetailsList;
    }

    @GetMapping(value="/IdeaDTO" )
    public List<IdeaDTO> getData45(Model model )
    {
        List<IdeaDTO> IdeaDTOList=hackathonDetailsService.getIdeaDTO();
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
