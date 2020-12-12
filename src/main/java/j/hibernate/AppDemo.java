package j.hibernate;

import j.hibernate.dao.EngineDao;
import j.hibernate.dao.Dao;
import j.hibernate.model.Engines;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppDemo {
    public static void main(String[] args) {

        SessionFactory factory=null;

        try {
            //SessionFactory sf = new Configuration().configure().buildSessionFactory();
            factory=new Configuration().configure().buildSessionFactory();
            Engines engines =new Engines("audi",780);
            Dao<Engines,String> engineDAO=new EngineDao(factory);

            engineDAO.create(engines);

        }finally {
            if(factory!=null){
                factory.close();
            }
        }
    }
}
