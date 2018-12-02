package com.satish.exp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MsqlConn {

    public static void main(String[] args) throws Exception{

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","satish", "XXXXXXX");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from example");
        while (resultSet.next())
            System.out.println("1: " + resultSet.getString(1) + ", 2: " + resultSet.getString(2));

        connection.close();
    }

}
