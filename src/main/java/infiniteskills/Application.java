package infiniteskills;

import infiniteskills.model.HibernateUtil;
import infiniteskills.model.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;

import static java.lang.System.exit;

public class Application {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSf().openSession();

        Transaction transaction = session.getTransaction();
        transaction.begin();

        User user = new User()
                .setBirthDate(LocalDate.of(1964, 8, 8))
                .setFirstName("Giuseppe")
                .setLastName("Conte")
                .setEmailAdress("giuseppe.conte@gmail.com")
                .setCreatedBy("facoquero")
                .setCreatedDate(LocalDate.now())
                .setLastUpdatedBy("facoquero")
                .setLastUpdatedDate(LocalDate.now());

        session.save(user);

        transaction.commit();
        session.beginTransaction();
        user.setLastName("Conteno");
        session.update(user);
        session.getTransaction().commit();

        session.beginTransaction();
        User dbUser = session.get(User.class, user.getUserId());
        session.update(dbUser.setCreatedBy("King Kong"));
        session.getTransaction().commit();


        session.close();
        exit(0);
    }
}
