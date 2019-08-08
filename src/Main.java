/*
import com.bootcamp.model.HackathonDetails;
import com.bootcamp.service.HackathonDetailsService;
import com.bootcamp.service.HackathonDetailsServiceImpl;
import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import javax.persistence.metamodel.EntityType;
import java.util.Date;

public class Main
    {
        private static final SessionFactory ourSessionFactory;
        private static ServiceRegistry serviceRegistry;
        static {
            try {
                System.out.println("yeha hello");
                Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
                serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
                ourSessionFactory = configuration.buildSessionFactory(serviceRegistry);

            } catch (Throwable ex) {
                throw new ExceptionInInitializerError(ex);
            }
        }
        public static Session getSession() throws HibernateException {
            return ourSessionFactory.openSession();
        }
        public static void main(final String[] args) throws Exception
        {
            System.out.println("yeha hello");
            final Session session = getSession();
            try {
                System.out.println("querying all the managed entities...");
                */
/*final Metamodel metamodel = session.getSessionFactory().getMetamodel();
                for (EntityType<?> entityType : metamodel.getEntities()) {
                    final String entityName = entityType.getName();
                    final Query query = session.createQuery("from " + entityName);
                    System.out.println("executing: " + query.getQueryString());
                    for (Object o : query.list()) {
                        System.out.println("  " + o);
                    } }*//*

                 */
/*  HackathonDetailsService hackathonDetailsService=new HackathonDetailsServiceImpl();
                    HackathonDetails hackathonDetails=new HackathonDetails("pune","ludo",123,new Date());
                    boolean b = hackathonDetailsService.saveHackathonDetails(hackathonDetails);*//*

            } finally {
                session.close();
            }
        }
    }

*/
