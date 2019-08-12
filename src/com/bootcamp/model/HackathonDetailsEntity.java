package com.bootcamp.model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "hackathon_details", schema = "bootcamp")
public class HackathonDetailsEntity {
    private Integer id;
    private String eventName;
    private String moOffice;
    private Date dateConducted;
    private Integer totalIdea;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
    public Integer getTotalIdea() {
        return totalIdea;
    }

    public void setTotalIdea(Integer totalIdea) {
        this.totalIdea = totalIdea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HackathonDetailsEntity that = (HackathonDetailsEntity) o;
        return id == that.id &&
                totalIdea == that.totalIdea &&
                Objects.equals(eventName, that.eventName) &&
                Objects.equals(moOffice, that.moOffice) &&
                Objects.equals(dateConducted, that.dateConducted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eventName, moOffice, dateConducted, totalIdea);
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ihackathon_id")
    private List <IdeaEntity> ideaEntities= new ArrayList<IdeaEntity>();
}
