package hiber.dao;

import hiber.model.Car;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CarDao implements Dao<Car,Integer> {
    private final SessionFactory factory;

    public CarDao(SessionFactory factory) {
        this.factory = factory;
    }


    @Override
    public void create(Car car) {
        try(Session session=factory.openSession()) {
            session.beginTransaction();
            session.save(car);
            session.getTransaction().commit();
        }
    }

    @Override
    public Car read(Integer id) {
        try(Session session=factory.openSession()) {
            Car newCar=session.get(Car.class,id);
            if(newCar!=null){
                Hibernate.initialize(newCar.getEngine()); //каскадно инициализирует всю информацию о данном поле. независимо от закрытии сессии
            }
            return newCar!=null ? newCar: new Car();
        }
    }

    @Override
    public void update(Car car) {
        try(Session session=factory.openSession()) {

            session.getTransaction();
            session.update(car);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Car car) {
        try(Session session=factory.openSession()) {
            session.getTransaction();
            session.delete(car);
            session.getTransaction().commit();
        }
    }
}
