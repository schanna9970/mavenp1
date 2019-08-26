package com.bootcamp.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "hackathon_details", schema = "bootcamp")
public class HackathonDetailsEntity {
    private int id;
    private String eventName;
    private String moOffice;
    private Date dateConducted;
    private int totalIdea;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Event_name")
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Basic
    @Column(name = "moOffice")
    public String getMoOffice() {
        return moOffice;
    }

    public void setMoOffice(String moOffice) {
        this.moOffice = moOffice;
    }

    @Basic
    @Column(name = "DateConducted")
    public Date getDateConducted() {
        return dateConducted;
    }

    public void setDateConducted(Date dateConducted) {
        this.dateConducted = dateConducted;
    }

    @Basic
    @Column(name = "totalIdea")
    public int getTotalIdea() {
        return totalIdea;
    }

    public void setTotalIdea(int totalIdea) {
        this.totalIdea = totalIdea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HackathonDetailsEntity that = (HackathonDetailsEntity) o;

        if (id != that.id) return false;
        if (totalIdea != that.totalIdea) return false;
        if (!Objects.equals(eventName, that.eventName)) return false;
        if (!Objects.equals(moOffice, that.moOffice)) return false;
        if (!Objects.equals(dateConducted, that.dateConducted))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (eventName != null ? eventName.hashCode() : 0);
        result = 31 * result + (moOffice != null ? moOffice.hashCode() : 0);
        result = 31 * result + (dateConducted != null ? dateConducted.hashCode() : 0);
        result = 31 * result + totalIdea;
        return result;
    }
}
