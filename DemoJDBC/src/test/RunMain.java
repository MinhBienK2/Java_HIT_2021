package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RunMain {
    public static void main(String[] args) {

        final String url = "jdbc:sqlserver://localhost:1433;databaseName=TestJDBC;user=sa;password=123";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }
}
