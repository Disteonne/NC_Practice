package hiber.dao;

public interface Dao<Entity,Key> {
    void create(Entity model);
    Entity read(Key key);
    void update(Entity model);
    void delete(Entity model);
}
