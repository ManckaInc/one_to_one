package pl.hibernate.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pl.hibernate.test.model.Passport;
import pl.hibernate.test.model.Person;

public class App
{
    public static void main( String[] args )
    {
        Configuration configuration= new Configuration().addAnnotatedClass(Person.class)
                .addAnnotatedClass(Passport.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try(sessionFactory){
            session.beginTransaction();

//            Person person = new Person("Test person", 34);
//            Passport passport = new Passport(123412);
//
//            person.setPassport(passport);
//
//            session.save(person);

//            Person person = session.get(Person.class, 1);
//            System.out.println(person.getPassport().getPassport_number());

//            Passport passport = session.get(Passport.class, 1);
//            System.out.println(passport.getPerson().getName());

            Passport passport = session.get(Passport.class, 1);
            System.out.println(passport.getPerson().getName());

            session.getTransaction().commit();
        }
    }
}
