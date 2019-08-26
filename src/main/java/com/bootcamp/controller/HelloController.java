package com.bootcamp.controller;

import com.bootcamp.dto.HackathonDetailDTO;
import com.bootcamp.service.HackathonDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    HackathonDetailsService hackathonDetailsService;

    @GetMapping(value="/hackathonsDTO" )
    public List<HackathonDetailDTO> getHackathonsDTOList()
    {
        System.out.println("ghya");
        List<HackathonDetailDTO> hackthonDetailsList=hackathonDetailsService.getHackathonDetailsDTO();

        return hackthonDetailsList;
    }
}
