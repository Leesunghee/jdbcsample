package me.himalaya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Application {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://49.247.211.14:5432/springdata";
        String username = "realwunz";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
//            System.out.println("Connection created: " + connection);
//            String sql = "CREATE TABLE ACCOUNT (id int, username varchar(255), password varchar(255));";
            String sql = "INSERT INTO ACCOUNT VALUES(1, 'sunghee', 'pass')";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
