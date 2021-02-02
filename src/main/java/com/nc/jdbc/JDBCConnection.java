package com.nc.jdbc;

import org.postgresql.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCConnection {

    private Connection connection;

    private final String user = "postgres";
    private final String password = "lbfyf1999";
    private final String url = "jdbc:postgresql://localhost:5432/testdb2021";

    public JDBCConnection() {
        provideConnection();
    }

    private void provideConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException | SQLException EX) {

        }
    }


    private List<Employee> selectAll(){
        List<Employee> resultList=new ArrayList<>();
        try {

            Statement statement= connection.createStatement();

            String query="SELECT * FROM employee";

           ResultSet resultSet= statement.executeQuery(query);

           while (resultSet.next()){
               Employee employee = new Employee(resultSet.getInt("id"),resultSet.getString("name"),
                       resultSet.getString("position"),resultSet.getDouble("salary"));
               resultList.add(employee);
           }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  resultList;

    }

    public static void main(String[] args) {

        JDBCConnection jdbcConnection=new JDBCConnection();
        List<Employee> list= jdbcConnection.selectAll();
        for (Employee e:list
             ) {
            System.out.println(e.getName());
        }
    }
}
