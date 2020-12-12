package j.hibernate.dao;

import j.hibernate.model.Engines;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EngineDao implements Dao<Engines,String> {
    //потокобезопасный
    private final SessionFactory factory;

    public EngineDao(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(Engines engines) {
        //session-поток. НЕ
        try (Session session=factory.openSession()) {

            session.beginTransaction();
            session.save(engines);
            session.getTransaction().commit();

        }
    }

    @Override
    public Engines read(String model) {
        try(Session session=factory.openSession()) {

           Engines result=session.get(Engines.class,model);
           return result!=null? result: new Engines();
        }
    }

    @Override
    public void update(Engines engines) {
        try(Session session=factory.openSession()) {

            session.beginTransaction();
            session.update(engines);
            session.getTransaction().commit();

        }
    }

    @Override
    public void delete(Engines engines) {
        try(Session session=factory.openSession()) {

            session.beginTransaction();
            session.delete(engines);
            session.getTransaction().commit();

        }
    }
}
