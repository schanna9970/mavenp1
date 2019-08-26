package com.bootcamp.transformer;

import com.bootcamp.dto.IdeaDTO;
import com.bootcamp.model.IdeasEntity;
import org.springframework.stereotype.Component;

@Component
public class IdeaTransformImpl implements IdeaTransform {
    @Override
    public IdeasEntity IdeaDTOTOEntity(IdeaDTO ideaDTO)
    {
        IdeasEntity ideaEntity=new IdeasEntity();
        ideaEntity.setIdeaId(ideaDTO.getIdea_id());
        ideaEntity.setIdeaCategory(ideaDTO.getIdea_category());
        ideaEntity.setIdeaSummary(ideaDTO.getIdea_summary());
        ideaEntity.setIdeaDetails(ideaDTO.getIdea_details());
        ideaEntity.setIdeaTeamMembers(ideaDTO.getIdea_team_members());
        ideaEntity.setIdeaLikes(ideaDTO.getIdea_likes());
        ideaEntity.setIhackathonid(ideaDTO.getIhackathon_id());
        return ideaEntity;
    }

    @Override
    public IdeaDTO IdeaEntityToDTO(IdeasEntity ideaEntity) {
        IdeaDTO ideaDTO=new IdeaDTO();
        ideaDTO.setIdea_id(ideaEntity.getIdeaId());
        ideaDTO.setIdea_category(ideaEntity.getIdeaCategory());
        ideaDTO.setIdea_details(ideaEntity.getIdeaDetails());
        ideaDTO.setIdea_summary(ideaEntity.getIdeaSummary());
        ideaDTO.setIdea_likes(ideaEntity.getIdeaLikes());
        ideaDTO.setIdea_team_members(ideaEntity.getIdeaTeamMembers());
        ideaDTO.setIhackathon_id(ideaEntity.getIhackathonid());
        return ideaDTO;
    }
}
