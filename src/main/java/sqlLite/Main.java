package sqlLite;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        User user=new User(2,"Diana","Razmikovna");
        DataBaseLogic db=new DataBaseLogic();
        db.addDB(user);
    }
}
