package com.bootcamp.transformer;

import com.bootcamp.dto.HackathonDetailDTO;
import com.bootcamp.model.HackathonDetailsEntity;

public interface HackathonTransform {
    HackathonDetailDTO HackathonEntityToDTO(HackathonDetailsEntity hackathonDetailsEntity);
    HackathonDetailsEntity HackathonDTOToEntity(HackathonDetailDTO hackathonDetailDTO);
}
