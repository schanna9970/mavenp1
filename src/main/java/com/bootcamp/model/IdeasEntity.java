package com.bootcamp.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ideas", schema = "bootcamp")
public class IdeasEntity {
    private int ideaId;
    private String ideaSummary;
    private String ideaDetails;
    private String ideaCategory;
    private String ideaTeamMembers;
    private int ideaLikes;
    private Integer ihackathonid;

    @Id
    @Column(name = "idea_id")
    public int getIdeaId() {
        return ideaId;
    }

    public void setIdeaId(int ideaId) {
        this.ideaId = ideaId;
    }

    @Basic
    @Column(name = "idea_summary")
    public String getIdeaSummary() {
        return ideaSummary;
    }

    public void setIdeaSummary(String ideaSummary) {
        this.ideaSummary = ideaSummary;
    }

    @Basic
    @Column(name = "idea_details")
    public String getIdeaDetails() {
        return ideaDetails;
    }

    public void setIdeaDetails(String ideaDetails) {
        this.ideaDetails = ideaDetails;
    }

    @Basic
    @Column(name = "idea_category")
    public String getIdeaCategory() {
        return ideaCategory;
    }

    public void setIdeaCategory(String ideaCategory) {
        this.ideaCategory = ideaCategory;
    }

    @Basic
    @Column(name = "idea_team_members")
    public String getIdeaTeamMembers() {
        return ideaTeamMembers;
    }

    public void setIdeaTeamMembers(String ideaTeamMembers) {
        this.ideaTeamMembers = ideaTeamMembers;
    }

    @Basic
    @Column(name = "idea_likes")
    public int getIdeaLikes() {
        return ideaLikes;
    }

    public void setIdeaLikes(int ideaLikes) {
        this.ideaLikes = ideaLikes;
    }

    @Basic
    @Column(name = "ihackathonid")
    public Integer getIhackathonid() {
        return ihackathonid;
    }

    public void setIhackathonid(Integer ihackathonid) {
        this.ihackathonid = ihackathonid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdeasEntity that = (IdeasEntity) o;

        if (ideaId != that.ideaId) return false;
        if (ideaLikes != that.ideaLikes) return false;
        if (!Objects.equals(ideaSummary, that.ideaSummary)) return false;
        if (!Objects.equals(ideaDetails, that.ideaDetails)) return false;
        if (!Objects.equals(ideaCategory, that.ideaCategory)) return false;
        if (!Objects.equals(ideaTeamMembers, that.ideaTeamMembers))
            return false;
        if (!Objects.equals(ihackathonid, that.ihackathonid)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ideaId;
        result = 31 * result + (ideaSummary != null ? ideaSummary.hashCode() : 0);
        result = 31 * result + (ideaDetails != null ? ideaDetails.hashCode() : 0);
        result = 31 * result + (ideaCategory != null ? ideaCategory.hashCode() : 0);
        result = 31 * result + (ideaTeamMembers != null ? ideaTeamMembers.hashCode() : 0);
        result = 31 * result + ideaLikes;
        result = 31 * result + (ihackathonid != null ? ihackathonid.hashCode() : 0);
        return result;
    }
}
