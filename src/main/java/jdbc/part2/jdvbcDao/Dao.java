package jdbc.part2.jdvbcDao;

public interface Dao<Entity,Key> {
    //работаем только с одиночными сущностями
    boolean create(Entity model);
    Entity read(Key key);
    boolean update(Entity model);
    boolean delete(Entity model);
}
