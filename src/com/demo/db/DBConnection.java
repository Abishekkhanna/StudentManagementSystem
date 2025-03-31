package com.demo.db;
import java.sql.*;
public class DBConnection {
    static Connection con;
    public static Connection createConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String pass = "abishekkhanna";
            String url = "jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false";
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
