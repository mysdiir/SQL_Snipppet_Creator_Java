package DAO;

import com.sun.jdi.connect.spi.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class GamesTable {

    private static final String SQL_DRIVER   = "com.mysql.cj.jdbc.Driver";
    private static final String SQL_SERVER   = "localhost";
    private static final String SQL_PORT     = "3306";
    private static final String SQL_DATABASE = "testdb";
    private static final String SQL_USERNAME = "root";
    private static final String SQL_PASSWORD = "";

    private Connection sqlConnection = null;

    public GamesTable() {
        try {
            Class.forName(SQL_DRIVER);
        } catch (ClassNotFoundException e) {
            System.err.println("MYSQL JDBC connnector not found!");
            e.printStackTrace();
            ;
            System.exit(-1);
        }

        try {
            sqlConnection = (Connection) DriverManager.getConnection(
                    "jdbc:mysql://" + SQL_SERVER + ":" + SQL_PORT +
                            "/" + SQL_DATABASE, SQL_USERNAME, SQL_PASSWORD);
        } catch (SQLException e) {
            System.err.println("SQL database initialization not possible!");
            e.printStackTrace();
            System.exit(-2);
        }
    }
}
