package many-to-many;


import many_to_many.entity.Child;
import many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToMany {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Child.class).addAnnotatedClass(Section.class).buildSessionFactory();
        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            int idSection = 4;
            Section section = session.get(Section.class, idSection);
            session.delete(section);
            int idChild = 5;
            Child child = session.get(Child.class, idChild);
            session.delete(child);
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}