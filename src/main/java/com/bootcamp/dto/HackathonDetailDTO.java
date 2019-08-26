package com.bootcamp.dto;

import org.springframework.stereotype.Component;

@Component
public class HackathonDetailDTO {
        private Integer id;
        private String eventName;
        private String moOffice;
        private String dateConducted;
        private Integer totalIdea;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getMoOffice() {
        return moOffice;
    }

    public void setMoOffice(String moOffice) {
        this.moOffice = moOffice;
    }

    public String getDateConducted() {
        return dateConducted;
    }

    public void setDateConducted(String dateConducted) {
        this.dateConducted = dateConducted;
    }

    public Integer getTotalIdea() {
        return totalIdea;
    }

    public void setTotalIdea(Integer totalIdea) {
        this.totalIdea = totalIdea;
    }
}
