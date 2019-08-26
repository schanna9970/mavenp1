package com.bootcamp.repository;


import com.bootcamp.model.HackathonDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HackathonDetailsRepo extends JpaRepository<HackathonDetailsEntity,Integer>
{
}
