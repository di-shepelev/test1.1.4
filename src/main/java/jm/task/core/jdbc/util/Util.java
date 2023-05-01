package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/datatest";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASS = "56329845";

    public static Connection getConnection() {

        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASS);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    // реализуйте настройку соеденения с БД
}
