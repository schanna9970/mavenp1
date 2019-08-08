package com.bootcamp.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HackathonDetails {
    private int id;
    private String mo_office;
    private String event_name;
    private int no_of_idea;
    //SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
    private Date event_conducted;


    public HackathonDetails(String mo_office, String event_name, int no_of_idea, Date event_conducted)
    {
        this.mo_office = mo_office;
        this.event_name = event_name;
        this.no_of_idea = no_of_idea;
        this.event_conducted =event_conducted;
    }

    public HackathonDetails() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMo_office() {
        return mo_office;
    }

    public void setMo_office(String mo_office) {
        this.mo_office = mo_office;
    }

    public String getevent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public int getNo_of_idea() {
        return no_of_idea;
    }

    public void setNo_of_idea(int no_of_idea) {
        this.no_of_idea = no_of_idea;
    }

    public Date getEvent_conducted() {
        return event_conducted;
    }

    public void setEvent_conducted(Date event_conducted) {
        this.event_conducted = event_conducted;
    }
}
