package infiniteskills.model;

import infiniteskills.model.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sf = buildSessionFactoryByXMl();

    private static SessionFactory buildSessionFactoryByPropertiesFile() {
        try
        {
            Configuration cfg = new Configuration();
            cfg.addAnnotatedClass(User.class);
            return cfg.buildSessionFactory(new StandardServiceRegistryBuilder().build());
        }
        catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    private static SessionFactory buildSessionFactoryByXMl() {
        try {
            Configuration cfg = new Configuration();
            return cfg.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static SessionFactory getSf() {
        return sf;
    }
}
