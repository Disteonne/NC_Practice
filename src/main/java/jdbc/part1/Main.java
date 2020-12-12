package jdbc.part1;

import jdbc.part1.Crud;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Crud crud=new Crud();
        try {
            crud.getInfo();
        }catch (SQLException exSql){
            exSql.printStackTrace();
        }
    }
}
