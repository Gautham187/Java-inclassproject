package TaskManager;

import java.sql.*;

public class CreateTable {
    public static void main(String[] args) throws Exception {
        Connection c = DBConnection.getConnection();
        String table = """
            CREATE TABLE IF NOT EXISTS TOdolist(
                id INT PRIMARY KEY,
                name VARCHAR(50),
                status VARCHAR(50)
            )
            """;
        Statement s = c.createStatement();
        s.executeUpdate(table);
        System.out.println("Table Created");
    }
}
