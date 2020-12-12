package jdbc.part2.jdvbcDao;

import jdbc.part2.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao implements Dao<User,String> {
    private Connection connection;

    public UserDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean create(User user) {
        boolean result = false;
        try (PreparedStatement statement = connection.prepareStatement(QueryUser.INSERT.QUERY)) {

            statement.setString(1, user.getLogin());
            statement.setString(2, user.getPassword());
            statement.setInt(3, user.getRole().getId());
            result =statement.executeQuery().next();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public User read(String login) {
        User user=new User();
        user.setId(-1);//default
        try(PreparedStatement statement = connection.prepareStatement(QueryUser.GET.QUERY)){
            statement.setString(1,login);
            final ResultSet result=statement.executeQuery();
            if(result.next()){
                user.setId(result.getInt("id"));//user.setId(Integer.parseInt(result.getString("id"));
                user.setLogin(result.getString("login"));
                user.setPassword(result.getString("password"));
                user.setRole(new User.Role(result.getInt("id"),result.getString("role")));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

    @Override
    public boolean update(User user) {
       boolean result=false;
       try(PreparedStatement statement = connection.prepareStatement(QueryUser.UPDATE.QUERY)){
           statement.setString(1,user.getPassword());
           statement.setInt(2,user.getId());
           result=statement.executeQuery().next();
       } catch (SQLException throwables) {
           throwables.printStackTrace();
       }
       return result;
    }

    @Override
    public boolean delete(User user) {
        boolean result=false;
        try(PreparedStatement statement = connection.prepareStatement(QueryUser.DELETE.QUERY)){
            statement.setInt(1,user.getId());
            statement.setString(2,user.getLogin());
            statement.setString(3,user.getPassword());
            result=statement.executeQuery().next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }

    enum QueryUser{

        GET("SELECT * FROM users WHERE login= (?)"),
        INSERT("INSERT INTO users (id,login,password,role) VALUES (DEFAULT,(?),(?),(?)) RETURNING id"),
        DELETE("DELETE FROM users WHERE id=(?) AND login=(?) AND password=(?) RETURNING id"),
        UPDATE("UPDATE users SET password=(?) WHERE id=(?) RETURNING id");


        String QUERY;

        QueryUser(String QUERY) {
            this.QUERY=QUERY;
        }
    }
}
