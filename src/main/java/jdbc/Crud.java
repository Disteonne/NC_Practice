package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Crud {
    static Connection connection;

    static {
        try {
            connection = new ConnectionSQL().getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public void getInfo() throws SQLException {
        try(PreparedStatement statement=connection.prepareStatement("SELECT * FROM users WHERE id= (?)")) {

            statement.setInt(1,1);//index в sql начинается с 1. Пусть id=1;

            ResultSet resultSet=statement.executeQuery();

            while (resultSet.next()){
                String login="login: "+resultSet.getString("login");
                String password="password: "+resultSet.getString(3);//3я колонка в таблице
                int role=resultSet.getInt("role");
                System.out.println(login+" - - - "+password+" - - - role:"+role);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            connection.close();
        }
    }
}
