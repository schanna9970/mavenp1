package com.bootcamp.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ideas", schema = "bootcamp")
public class IdeaEntity {
    private int idea_id;
    private String idea_summary;
    private String idea_details;
    private String idea_category;
    private String idea_team_members;
    private int idea_likes;
    private Integer ihackathon_id;

    @Id
    @Column(name = "idea_id")
    public int getId() {
        return idea_id;
    }
    public void setId(int idea_id) {
        this.idea_id = idea_id;
    }

    @Basic
    @Column(name = "idea_summary")
    public String getIdea_summary() {
        return idea_summary;
    }
    public void setIdea_summary(String idea_summary) {
        this.idea_summary = idea_summary;
    }

    @Basic
    @Column(name = "idea_details")
    public String getIdea_details() {
        return idea_details;
    }
    public void setIdea_details(String idea_details) {
        this.idea_details = idea_details;
    }

    @Basic
    @Column(name = "idea_category")
    public String getIdea_category() {
        return idea_category;
    }
    public void setIdea_category(String idea_category) {
        this.idea_category = idea_category;
    }

    @Basic
    @Column(name = "idea_team_members")
    public String getIdea_team_members() {
        return idea_team_members;
    }
    public void setIdea_team_members(String idea_team_members) {
        this.idea_team_members= idea_team_members;
    }

    @Basic
    @Column(name = "idea_likes")
    public int getIdea_likes() {
        return idea_likes;
    }
    public void setIdea_likes(int idea_likes) {
        this.idea_likes = idea_likes;
    }

    @Basic
    @Column(name = "ihackathon_id")
    public Integer getIhackathon_id() {
        return ihackathon_id;
    }
    public void setIhackathon_id(Integer ihackathon_id) {
        this.ihackathon_id = ihackathon_id;
    }

    @ManyToOne
    @JoinColumn(name = "ihackathon_id")
    private HackathonDetailsEntity hackathonDetailsEntity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdeaEntity that = (IdeaEntity) o;
        return idea_id==that.idea_id && idea_likes==that.idea_likes && ihackathon_id == that.ihackathon_id &&
                Objects.equals(idea_category, that.idea_category) &&
                Objects.equals(idea_details, that.idea_details) &&
                Objects.equals(idea_summary, that.idea_summary) &&
                Objects.equals(idea_team_members,that.idea_team_members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idea_id,idea_category,idea_details,idea_summary,idea_team_members,idea_likes,ihackathon_id);
    }

}
