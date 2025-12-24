package dao;

import model.Instructor;
import java.util.ArrayList;
import util.DBConnection;
import java.sql.*;

public class InstructorDao {

    // ================= ADD =================
    public boolean addInstructor(Instructor i) {

        String sql =
            "INSERT INTO Instructors(userId, fname, lname, email, phone) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, i.getUserId());
            ps.setString(2, i.getFname());
            ps.setString(3, i.getLname());
            ps.setString(4, i.getEmail());
            ps.setString(5, i.getPhone());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Add Instructor Error: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteInstructorById(int instructorId) {

        String sql = """
            DELETE FROM Users
            WHERE id = (
                SELECT userId FROM Instructors WHERE id = ?
            )
            """;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, instructorId);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Delete Instructor Error: " + e.getMessage());
            return false;
        }
    }

    
    // ================= GET BY USER ID =================
    public Instructor getInstructorByUserId(int userId) {

        String sql = """
            SELECT i.id AS instructorId, u.id AS userId, u.username, u.password,
                   i.fname, i.lname, i.email, i.phone
            FROM Instructors i
            JOIN Users u ON i.userId = u.id
            WHERE u.id = ?
            """;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Instructor(
                    rs.getInt("instructorId"),
                    rs.getInt("userId"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("fname"),
                    rs.getString("lname"),
                    rs.getString("email"),
                    rs.getString("phone")
                );
            }

        } catch (SQLException e) {
            System.out.println("Get Instructor Error: " + e.getMessage());
        }
        return null;
    }

    // ================= GET ALL =================
    public ArrayList<Instructor> getAllInstructors() {

        ArrayList<Instructor> list = new ArrayList<>();

        String sql = """
            SELECT i.id AS instructorId, u.id AS userId, u.username, u.password,
                   i.fname, i.lname, i.email, i.phone
            FROM Instructors i
            JOIN Users u ON i.userId = u.id
            """;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                list.add(new Instructor(
                    rs.getInt("instructorId"),
                    rs.getInt("userId"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("fname"),
                    rs.getString("lname"),
                    rs.getString("email"),
                    rs.getString("phone")
                ));
            }

        } catch (SQLException e) {
            System.out.println("Get All Instructors Error: " + e.getMessage());
        }
        return list;
    }

    // ================= COUNT =================
    public int countInstructors() {

        String sql = "SELECT COUNT(*) FROM Instructors";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) return rs.getInt(1);

        } catch (SQLException e) {
            System.out.println("Count Instructors Error: " + e.getMessage());
        }
        return 0;
    }
}
