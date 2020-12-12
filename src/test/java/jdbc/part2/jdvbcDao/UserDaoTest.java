package jdbc.part2.jdvbcDao;

import jdbc.part2.model.User;
import junit.framework.TestCase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserDaoTest extends TestCase {

    private Dao<User,String> dao;

    private Connection connection;

    public void connect() throws SQLException {
        final String user="postgres";
        final String password="lbfyf1999";
        final String url="jdbc:postgresql://localhost:5432/phones_magazine";
        connection = DriverManager.getConnection(url,user,password);
        dao=new UserDao(connection);
    }

    public void  closeConnect(){
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void testCreate() {
        try {
            connect();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        User user=new User();
        user.setLogin("diana.ra");
        user.setPassword("12345");
        User.Role role=new User.Role(1,"admin");
        user.setRole(role);
        boolean result= dao.create(user);
        User expectedUser=dao.read("diana.ra");
        assertEquals("12345",expectedUser.getPassword());

    }

    public void testRead() {
        try {
            connect();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        User user=dao.read("Pavel");
        assertEquals("123",user.getPassword());
    }

    public void testUpdate() {
        try {
            connect();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        /*
        User userForUpdate=new User(6,"Igor","000",new User.Role(2,"user"));
        dao.create(userForUpdate);
        User g=dao.read("Igor");
        g.setPassword("mySon13");
        dao.update(g);
        User userExpected=dao.read("Igor");
        assertEquals("mySon13",userExpected.getPassword());
         */
        User user=dao.read("Igor");
        user.setPassword("newPass");
        boolean res=dao.update(user);
        assertEquals(true,res);
    }
}