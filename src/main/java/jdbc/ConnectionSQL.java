package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSQL {
    private final String user="postgres";
    private final String password="lbfyf1999";
    private final String url="jdbc:postgresql://localhost:5432/phones_magazine";

    private final Connection connectSql= DriverManager.getConnection(url,user,password);

    public ConnectionSQL() throws SQLException {
    }

    public Connection getConnection(){
        return connectSql;
    }
}
