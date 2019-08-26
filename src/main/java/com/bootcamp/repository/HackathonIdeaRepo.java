package com.bootcamp.repository;


import com.bootcamp.model.IdeasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HackathonIdeaRepo extends JpaRepository<IdeasEntity,Integer>
{
    //List<IdeaEntity> getIdeaEntitiesByIhackathonid(Integer hackathonid);
    List<IdeasEntity> getIdeaEntitiesByIdeaCategory(String name);
    List<IdeasEntity> getIdeaEntitiesByIhackathonid(Integer id);


}
