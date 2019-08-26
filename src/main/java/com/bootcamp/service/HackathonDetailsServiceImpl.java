package com.bootcamp.service;

import com.bootcamp.dto.HackathonDetailDTO;
import com.bootcamp.model.HackathonDetailsEntity;
import com.bootcamp.repository.HackathonDetailsRepo;
import com.bootcamp.transformer.HackathonTransformImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class HackathonDetailsServiceImpl implements HackathonDetailsService {
    @Autowired
    HackathonDetailsRepo hackathonDetailsRepo;
    @Autowired
    HackathonTransformImpl hackathonTransform;

    public List<HackathonDetailDTO> getHackathonDetailsDTO()
    {
        List<HackathonDetailDTO> hackathonDetailDTOList=new ArrayList<>();
        List<HackathonDetailsEntity> hackathonDetailsEntityList;
        hackathonDetailsEntityList=hackathonDetailsRepo.findAll();
        for (HackathonDetailsEntity hackathondetail1:hackathonDetailsEntityList)
        {
              hackathonDetailDTOList.add(hackathonTransform.HackathonEntityToDTO(hackathondetail1)) ;
        }
        return hackathonDetailDTOList;
    }
}
