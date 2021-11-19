package dk.clbo.repository.dbconnect;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBManager {
    // fields
    private static String user;
    private static String password;
    private static String url;
    private static Connection connection = null;

    // metoder
    public static Connection getConnection(){

        if (connection != null) {
           return connection;
        }

        url = System.getenv("url");//properties.getProperty("url");
        user = System.getenv("mp_user");//properties.getProperty("user");
        password = System.getenv("mp_password");//properties.getProperty("password");
        String port = System.getenv("port");

        try {
            connection = DriverManager.getConnection(url,user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
