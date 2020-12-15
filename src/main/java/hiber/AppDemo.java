package hiber;

import hiber.dao.EngineDao;
import hiber.dao.Dao;
import hiber.model.Engines;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppDemo {
    public static void main(String[] args) {

        SessionFactory factory=null;

        try {
            //SessionFactory sf = new Configuration().configure().buildSessionFactory();
            factory=new Configuration().configure().buildSessionFactory();
            Dao<Engines,String> engineDAO=new EngineDao(factory);


            Engines engines =new Engines("lada",160);
            //engineDAO.create(engines);

            System.out.println("-----------------------------------------------------");
            Engines result=engineDAO.read("lada");
            System.out.println(result.getModel());
            System.out.println("-----------------------------------------------------");


            result.setPower(124);
            engineDAO.update(result);

            engineDAO.delete(new Engines("lada",124));
            System.out.println(engineDAO.read("lada").getModel());

        }finally {
            if(factory!=null){
                factory.close();
            }
        }
    }
}
