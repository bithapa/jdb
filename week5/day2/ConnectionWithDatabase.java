package week5.jdb.takeo.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionWithDatabase {
    public static void main(String[] args) throws SQLException {

        /**
         * JAR vs WAR file?
         * JDBC?
         * String url = "jdbc:postgresql://localhost:5432/postgres";
         * String user =
         * String password =
         * */

        // Use connection interface to connect
        //      Reflection inside Connection?
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";       // user name
        String password = "everydays";   // password to database
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("connected");
        connection.close();

    }


}
