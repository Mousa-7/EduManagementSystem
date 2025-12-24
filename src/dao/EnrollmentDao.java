package dao;

import java.sql.*;
import java.util.ArrayList;
import util.DBConnection;

public class EnrollmentDao {

    public boolean enrollStudent(int studentId, int courseId) {

        String sql =
            "INSERT INTO Enrollments(studentId, courseId) VALUES (?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, studentId);
            ps.setInt(2, courseId);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Enroll Error: " + e.getMessage());
            return false;
        }
    }

    public boolean unEnrollStudent(int studentId, int courseId) {

        String sql =
            "DELETE FROM Enrollments WHERE studentId=? AND courseId=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, studentId);
            ps.setInt(2, courseId);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("UnEnroll Error: " + e.getMessage());
            return false;
        }
    }

    public ArrayList<Integer> getCoursesByStudent(int studentId) {

        ArrayList<Integer> list = new ArrayList<>();

        String sql =
            "SELECT courseId FROM Enrollments WHERE studentId=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, studentId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(rs.getInt("courseId"));
            }

        } catch (SQLException e) {
            System.out.println("Get Enrollments Error: " + e.getMessage());
        }
        return list;
    }

    public int countEnrollmentsByCourse(int courseId) {

        String sql =
            "SELECT COUNT(*) FROM Enrollments WHERE courseId=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            ps.setInt(1, courseId);
            if (rs.next()) return rs.getInt(1);

        } catch (SQLException e) {
            System.out.println("Count Enrollments Error: " + e.getMessage());
        }
        return 0;
    }
}
