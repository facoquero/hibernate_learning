package infiniteskills.model;

import infiniteskills.model.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sf = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try
        {
            Configuration cfg = new Configuration();

            cfg.addAnnotatedClass(User.class);


            return cfg.buildSessionFactory(new StandardServiceRegistryBuilder().build());

        }
        catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException("dupa zbita ");
        }
    }


    public static SessionFactory getSf() {
        return sf;
    }
}
