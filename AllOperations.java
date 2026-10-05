package TaskManager;

import java.sql.*;

public class AllOperations {
    public static final Connection c = DBConnection.getConnection();

    public static void AddTask() {
        String s = "INSERT INTO TOdolist VALUES(?,?,?)";
        try {
            PreparedStatement ps = c.prepareStatement(s);
            
            ps.setInt(1, 101);
            ps.setString(2, "Internship Application");
            ps.setString(3, "InProgress");
            ps.executeUpdate();

            ps.setInt(1, 102);
            ps.setString(2, "Java Certification Course");
            ps.setString(3, "Not Completed");
            ps.executeUpdate();

            ps.setInt(1, 103);
            ps.setString(2, "Registration for Hackathon");
            ps.setString(3, "Completed");
            ps.executeUpdate();

            System.out.println("Inserted rows");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void UpdateTask() {
        String query = "UPDATE TOdolist SET status=? WHERE id=?";
        try {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, "Completed");
            ps.setInt(2, 102);
            ps.executeUpdate();
            System.out.println("Updated rows");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void DeleteTask() {
        String query = "DELETE FROM TOdolist WHERE id=?";
        try {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setInt(1, 103);
            ps.executeUpdate();
            System.out.println("Deleted rows");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AddTask();
        UpdateTask();
        DeleteTask();
    }
}
