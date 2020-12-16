package sqlLite;

import org.sqlite.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseLogic {
   private  final String url="jdbc:sqlite:C:\\Users\\huawei\\Desktop\\DB_USER\\user_db.db";
   private Connection connection;

    public DataBaseLogic() throws SQLException {
        DriverManager.registerDriver(new JDBC());
        this.connection=DriverManager.getConnection(url);
    }

    public void  addDB(User user){
        try(PreparedStatement statement=connection.prepareStatement("INSERT INTO user (id,firstName,lastName) VALUES (1,(?),(?))")) {
            statement.setString(1,user.getFirstName());
            statement.setString(2,user.getLastName());
            statement.execute();

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
