package TaskManager;

import java.sql.*;

public class CreateDataBase {
    public static void main(String[] args) throws Exception {
        Connection c = DBConnection.getConnection();
        String database = "CREATE DATABASE IF NOT EXISTS Task";
        Statement s = c.createStatement();
        s.executeUpdate(database);
        System.out.println("Database Created");
    }
}
