package infiniteskills.model;

import infiniteskills.model.entity.Bank;
import infiniteskills.model.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class HibernateUtil {
    private static final SessionFactory sf = buildSessionFactoryByPropertiesFile();

    public static SessionFactory getSf() {
        return sf;
    }

    private static SessionFactory buildSessionFactoryByPropertiesFile() {
        try {
            Configuration cfg = new Configuration();
            cfg.addProperties(getProperties());
            cfg.addAnnotatedClass(User.class);
            cfg.addAnnotatedClass(Bank.class);
            return cfg.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    private static SessionFactory buildSessionFactoryByXMl() {
        try {
            Configuration cfg = new Configuration();
            cfg.configure("./xml/hibernate.cfg.xml");
            cfg.addAnnotatedClass(User.class);
            return cfg.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    private static Properties getProperties() throws IOException {
        Properties prop = new Properties();
        InputStream in = HibernateUtil.class.getResourceAsStream("/prop/hibernate.properties");
        prop.load(in);
        in.close();
        return prop;
    }
}
