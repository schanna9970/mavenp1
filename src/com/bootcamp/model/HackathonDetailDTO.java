package com.bootcamp.model;

import java.util.Date;

public class HackathonDetailDTO {
        private int id;
        private String eventName;
        private String moOffice;
        private String dateConducted;
        private int totalIdea;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getTotalIdea() {
        return totalIdea;
    }

    public void setTotalIdea(int totalIdea) {
        this.totalIdea = totalIdea;
    }
}
