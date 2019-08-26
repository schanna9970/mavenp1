package com.bootcamp.transformer;

import com.bootcamp.dto.IdeaDTO;
import com.bootcamp.model.IdeasEntity;

public interface IdeaTransform {
    IdeasEntity IdeaDTOTOEntity(IdeaDTO ideaDTO);
    IdeaDTO IdeaEntityToDTO(IdeasEntity ideaEntity);
}
