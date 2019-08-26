package com.bootcamp.transformer;

import com.bootcamp.dto.HackathonDetailDTO;
import com.bootcamp.model.HackathonDetailsEntity;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Component
public class HackathonTransformImpl implements HackathonTransform {
    SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");

    public HackathonDetailDTO HackathonEntityToDTO(HackathonDetailsEntity hackathonDetailsEntity)
    {
        HackathonDetailDTO hackathonDTO=new HackathonDetailDTO();
        hackathonDTO.setId(hackathonDetailsEntity.getId());
        String temp_date=dateFormat2.format(hackathonDetailsEntity.getDateConducted());
        hackathonDTO.setDateConducted(temp_date);
        hackathonDTO.setEventName(hackathonDetailsEntity.getEventName());
        hackathonDTO.setMoOffice(hackathonDetailsEntity.getMoOffice());
        hackathonDTO.setTotalIdea(hackathonDetailsEntity.getTotalIdea());
        return  hackathonDTO;
    }

    public HackathonDetailsEntity HackathonDTOToEntity(HackathonDetailDTO hackathonDetailDTO)  {
        HackathonDetailsEntity hackathonDetailsEntity=new HackathonDetailsEntity();
        hackathonDetailsEntity.setTotalIdea(hackathonDetailDTO.getTotalIdea());
        hackathonDetailsEntity.setMoOffice(hackathonDetailDTO.getMoOffice());
        hackathonDetailsEntity.setEventName(hackathonDetailDTO.getEventName());
        hackathonDetailsEntity.setId(hackathonDetailDTO.getId());
        Date d= null;
        try {
            d = (Date) dateFormat2.parseObject(hackathonDetailDTO.getDateConducted());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        hackathonDetailsEntity.setDateConducted(d);
        return hackathonDetailsEntity;
    }
}
