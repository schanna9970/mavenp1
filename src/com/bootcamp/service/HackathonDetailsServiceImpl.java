package com.bootcamp.service;

import com.bootcamp.model.*;
import com.bootcamp.repository.HackathonDetailsRepo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class HackathonDetailsServiceImpl implements HackathonDetailsService{
    @Autowired
    HackathonDetailsRepo hackathonDetailsRepo;

    @Autowired
    private  static SessionFactory sessionFactory;
    private  static ServiceRegistry serviceRegistry;

    @Override
    public List<HackathonDetailsEntity> getHackathonDetails() {
        return hackathonDetailsRepo.getHackathonDetails();
    }

    @Override
    public List<HackathonDetailDTO> getHackathonDetailsDTO() {return  hackathonDetailsRepo.getHackathonDetailsDTO();}

    @Override
    public List<IdeaDTO> getIdeaDTO() {
        return hackathonDetailsRepo.getIdeaDTO();
    }


    @Override
    public List<IdeaEntity> getIdeaList() {
        return hackathonDetailsRepo.getIdeaList();
    }

    @Override
    public Map<String,List<IdeaDTO>> getIdeaList(int id) {
        return hackathonDetailsRepo.getIdeaList(id);
    }

    @Override
    public String postHackathonIdea(int HackathonId) {
        return hackathonDetailsRepo.postHackathonIdea(HackathonId);
    }
}
