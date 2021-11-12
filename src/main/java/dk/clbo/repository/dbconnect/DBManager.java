package dk.clbo.repository.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
    // fields
    private static String user;
    private static String password;
    private static String url;
    private static Connection connection = null;

    // metoder
    public static Connection getConnection() {

        if (connection != null) {
            return connection;
        }

        // Dette er ændret fra at læse fra application.properties filen til at læse environment variabler
        url = System.getenv("url"); //properties.getProperty("url");
        user = System.getenv("mp_user"); //properties.getProperty("user");
        password = System.getenv("mp_password"); //properties.getProperty("password");

        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
