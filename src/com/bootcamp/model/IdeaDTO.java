package com.bootcamp.model;

public class IdeaDTO {
    private Integer idea_id;
    private String idea_summary;
    private String idea_details;
    private String idea_category;
    private String idea_team_members;
    private Integer idea_likes;
    private Integer ihackathon_id;

    public IdeaDTO( String idea_summary, String idea_details, String idea_category, String idea_team_members, Integer idea_likes, Integer ihackathon_id) {
        super();
        this.idea_summary = idea_summary;
        this.idea_details = idea_details;
        this.idea_category = idea_category;
        this.idea_team_members = idea_team_members;
        this.idea_likes = idea_likes;
        this.ihackathon_id = ihackathon_id;
    }

    public IdeaDTO() { }

    public Integer getIdea_id() {
        return idea_id;
    }

    public void setIdea_id(Integer idea_id) {
        this.idea_id = idea_id;
    }

    public String getIdea_summary() {
        return idea_summary;
    }

    public void setIdea_summary(String idea_summary) {
        this.idea_summary = idea_summary;
    }

    public String getIdea_details() {
        return idea_details;
    }

    public void setIdea_details(String idea_details) {
        this.idea_details = idea_details;
    }

    public String getIdea_category() {
        return idea_category;
    }

    public void setIdea_category(String idea_category) {
        this.idea_category = idea_category;
    }

    public String getIdea_team_members() {
        return idea_team_members;
    }

    public void setIdea_team_members(String idea_team_members) {
        this.idea_team_members = idea_team_members;
    }

    public Integer getIdea_likes() {
        return idea_likes;
    }

    public void setIdea_likes(Integer idea_likes) {
        this.idea_likes = idea_likes;
    }

    public Integer getIhackathon_id() {
        return ihackathon_id;
    }

    public void setIhackathon_id(Integer ihackathon_id) {
        this.ihackathon_id = ihackathon_id;
    }

}
