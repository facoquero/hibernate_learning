package infiniteskills;

import infiniteskills.model.HibernateUtil;
import org.hibernate.Session;

public class Application {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSf().openSession();

        session.beginTransaction();
        session.close();
    }
}
