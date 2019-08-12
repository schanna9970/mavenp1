package com.bootcamp.repository;

import com.bootcamp.model.HackathonDetailsEntity;
import com.bootcamp.model.IdeaDTO;
import com.bootcamp.model.IdeaEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class IdeaRepoImpl implements IdeaRepo{

    Configuration configuration = new Configuration();
    @Autowired
    private  static SessionFactory sessionFactory;
    private  static ServiceRegistry serviceRegistry;

    List<HackathonDetailsEntity>  list=new ArrayList<>();
    List<IdeaEntity> ideaEntityList=new ArrayList<>();

    @Override
    public List<IdeaDTO> getIdeaDTO() {
        List<IdeaDTO> list=new ArrayList<>();
        try{
            Session session=getSession1();
            session.beginTransaction();
            Query<IdeaEntity> query=session.createQuery("From IdeaEntity ",IdeaEntity.class);
            List<IdeaEntity>  IdeasList=query.getResultList();
            for (int i = 0; i <IdeasList.size(); i++) {
                {
                    IdeaDTO dto=new IdeaDTO();
                    IdeaEntity ideaEntity=(IdeaEntity) IdeasList.get(i);
                    setIdeaDTO(dto,ideaEntity);
                    list.add(dto);
                }
            }
            session.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return list;
    }

    public void setIdeaDTO(IdeaDTO dto,IdeaEntity ideaEntity)
    {
        dto.setIdea_id(ideaEntity.getId());
        dto.setIdea_category(ideaEntity.getIdea_category());
        dto.setIdea_summary(ideaEntity.getIdea_summary());
        dto.setIdea_details(ideaEntity.getIdea_details());
        dto.setIdea_likes(ideaEntity.getIdea_likes());
        dto.setIdea_team_members(ideaEntity.getIdea_team_members());
        dto.setIhackathon_id(ideaEntity.getIhackathon_id());
    }

    @Override
    public List<IdeaEntity> getIdeaList() {
        try {
            Session session=getSession1();
            session.beginTransaction();
            Query<IdeaEntity> query1 = session.createQuery("From IdeaEntity Ie order by Ie.idea_summary", IdeaEntity.class);
            ideaEntityList = query1.getResultList();
            session.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return ideaEntityList;
    }

    @Override
    public Map<String,List<IdeaDTO>> getIdeaListbyID(int id) {
        List<IdeaDTO> list=new ArrayList<>();
        Map<String,List<IdeaDTO>> map=new HashMap<>();
        try {
            Session session=getSession1();
            session.beginTransaction();
            Query<IdeaEntity> query1 = session.createQuery("From IdeaEntity Ie where Ie.ihackathon_id=:id", IdeaEntity.class).setParameter("id",id);
            ideaEntityList = query1.getResultList();
            Query<String> query2 = session.createQuery("select eventName From HackathonDetailsEntity HD  where HD.id=:id").setParameter("id",id);
            String name=query2.getSingleResult();
            for (int i = 0; i <ideaEntityList.size(); i++)
            {
                IdeaDTO dto=new IdeaDTO();
                IdeaEntity ideaEntity=(IdeaEntity) ideaEntityList.get(i);
                setIdeaDTO(dto,ideaEntity);
                list.add(dto);
            }
            map.put(name,list);
            session.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return map;
    }

    @Override
    public String postHackathonIdea(int HackathonId)
    {
        IdeaDTO ideaDTO=new IdeaDTO("Gewt results","Getting Results","Domain","snehal Poornima",9,HackathonId);
        IdeaEntity ideaEntity=new IdeaEntity();
        try {
            Session session=getSession1();
            session.beginTransaction();
            putHackathonIdea(ideaDTO,ideaEntity);
            session.save(ideaEntity);
            session.getTransaction().commit();
            session.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return "success";
    }

    public void putHackathonIdea(IdeaDTO ideaDTO,IdeaEntity ideaEntity)
    {
        ideaEntity.setId(ideaDTO.getIdea_id());
        ideaEntity.setIdea_category(ideaDTO.getIdea_category());
        ideaEntity.setIdea_details(ideaDTO.getIdea_details());
        ideaEntity.setIdea_likes(ideaDTO.getIdea_likes());
        ideaEntity.setIdea_summary(ideaDTO.getIdea_summary());
        ideaEntity.setIhackathon_id(ideaDTO.getIhackathon_id());
        ideaEntity.setIdea_team_members(ideaDTO.getIdea_team_members());
    }

    @Override
    public IdeaDTO editIdea(Integer idea1_id)
    {
        IdeaDTO ideaDTO=new IdeaDTO("s","f","f","d",9,1);
        List<IdeaEntity> ideaEntityList=new ArrayList<>();
        IdeaEntity ideaEntity=new IdeaEntity();
        try {
            Session session=getSession1();
            session.beginTransaction();
            Query<IdeaEntity> query=session.createQuery("From IdeaEntity  Ie where Ie.id=:idea1_id", IdeaEntity.class).setParameter("idea1_id",idea1_id);
            ideaEntity=query.getSingleResult();
            ideaEntity.setIdea_category(ideaDTO.getIdea_category());
            ideaEntity.setIdea_details(ideaDTO.getIdea_details());
            ideaEntity.setIdea_likes(ideaDTO.getIdea_likes());
            ideaEntity.setIdea_summary(ideaDTO.getIdea_summary());
            ideaEntity.setIhackathon_id(ideaDTO.getIhackathon_id());
            ideaEntity.setIdea_team_members(ideaDTO.getIdea_team_members());
            ideaDTO.setIdea_id(idea1_id);
            ideaEntity.setId(idea1_id);
            session.update(ideaEntity);
            session.getTransaction().commit();
            session.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return  ideaDTO;
    }

    @Override
    public IdeaDTO editIdeathroughPostman(Integer idea1_id, IdeaDTO ideaDTO) {
        IdeaEntity ideaEntity;
        try {
            Session session=getSession1();
            session.beginTransaction();
            Query<IdeaEntity> query=session.createQuery("From IdeaEntity  Ie where Ie.id=:idea1_id", IdeaEntity.class).setParameter("idea1_id",idea1_id);
            ideaEntity=query.getSingleResult();
            ideaDTO.setIdea_id(idea1_id);
            ideaDTO.setIhackathon_id(ideaEntity.getIhackathon_id());
            ideaEntity.setIdea_category(ideaDTO.getIdea_category());
            ideaEntity.setIdea_details(ideaDTO.getIdea_details());
            ideaEntity.setIdea_summary(ideaDTO.getIdea_summary());
            ideaEntity.setIdea_team_members(ideaDTO.getIdea_team_members());
            session.update(ideaEntity);
            session.getTransaction().commit();
            session.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return  ideaDTO;
    }

    @Override
    public IdeaDTO likeIdea(Integer idea_id) {
        IdeaEntity ideaEntity;
        IdeaDTO ideaDTO=new IdeaDTO();
        try {
            Session session=getSession1();
            session.beginTransaction();
            Query<IdeaEntity> query=session.createQuery("From IdeaEntity  Ie where Ie.id=:idea_id", IdeaEntity.class).setParameter("idea_id",idea_id);
            ideaEntity=query.getSingleResult();
            ideaEntity.setIdea_likes(ideaEntity.getIdea_likes()+1);
            session.update(ideaEntity);
            setIdeaDTO(ideaDTO,ideaEntity);
            session.getTransaction().commit();
            session.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return  ideaDTO;
    }

    public Session getSession1()
    {
        configuration.addAnnotatedClass(com.bootcamp.model.IdeaEntity.class);
        configuration.addAnnotatedClass(com.bootcamp.model.HackathonDetailsEntity.class);
        configuration.configure();
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();
        return session;
    }
}
