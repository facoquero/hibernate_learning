package infiniteskills;

import infiniteskills.model.HibernateUtil;
import infiniteskills.model.entity.Bank;
import infiniteskills.model.entity.User;
import org.hibernate.PropertyValueException;
import org.hibernate.Session;

import java.time.LocalDate;
import java.util.function.Consumer;

import static java.lang.System.exit;

public class Application {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSf().openSession();

        handlingUser(session);
        handlingBank(session);

        session.close();
        exit(0);
    }

    private static void handlingBank(Session session) {
        Bank first = session.get(Bank.class, 1l);
        System.out.println(first);
    }


    private static void handlingUser(Session session) {
        User user = createConrado();
        saving(session, user);

        assert user.isAdult();

        user.setLastName("Conteno");
        updating(session, user);

        checkingIfUpdatableWorks(session, user);
//        checkingIfNullableWorks(session);
    }

    private static void updating(Session session, User user) {
        doInTransaction(session, s -> s.update(user));
    }

    private static void saving(Session session, User user) {
        doInTransaction(session, s -> s.save(user));
    }

    private static void doInTransaction(Session session, Consumer<Session> consumer) {
        session.beginTransaction();
        consumer.accept(session);
        session.getTransaction().commit();
    }

    private static User createConrado() {
        return new User()
                .setBirthDate(LocalDate.of(1964, 8, 8))
                .setFirstName("Giuseppe")
                .setLastName("Conte")
                .setEmailAdress("giuseppe.conte@gmail.com")
                .setCreatedBy("facoquero")
                .setCreatedDate(LocalDate.now())
                .setLastUpdatedBy("facoquero")
                .setLastUpdatedDate(LocalDate.now());
    }

    private static void checkingIfNullableWorks(Session session) {
        try {
            saving(session, new User().setFirstName("Alfred").setLastName("Moreno"));
        } catch (PropertyValueException e) {
            e.printStackTrace();
        }

    }

    private static void checkingIfUpdatableWorks(Session session, User user) {
        doInTransaction(session, s -> {
            User dbUser = session.get(User.class, user.getUserId());
            session.update(dbUser.setCreatedBy("King Kong"));
        });
    }
}
