package dao;

import java.sql.*;
import java.util.ArrayList;
import model.Student;
import util.DBConnection;


public class StudentDao {

    // ================= ADD =================
    public boolean addStudent(Student s) {

        String sql =
            "INSERT INTO Students(userId, fname, lname, email, phone) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, s.getUserId());
            ps.setString(2, s.getFname());
            ps.setString(3, s.getLname());
            ps.setString(4, s.getEmail());
            ps.setString(5, s.getPhone());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Add Student Error: " + e.getMessage());
            return false;
        }
    }

    // ================= UPDATE =================
    public boolean updateStudent(Student s) {

        String sql =
            "UPDATE Students SET fname=?, lname=?, email=?, phone=? WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, s.getFname());
            ps.setString(2, s.getLname());
            ps.setString(3, s.getEmail());
            ps.setString(4, s.getPhone());
            ps.setInt(5, s.getStudentId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Update Student Error: " + e.getMessage());
            return false;
        }
    }

    // ================= DELETE =================
    public boolean deleteStudent(int studentId) {

        String sql = "DELETE FROM Students WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, studentId);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Delete Student Error: " + e.getMessage());
            return false;
        }
    }

    // ================= GET BY USER ID =================
    public Student getStudentByUserId(int userId) {

        String sql = """
            SELECT s.id AS studentId, u.id AS userId, u.username, u.password,
                   s.fname, s.lname, s.email, s.phone
            FROM Students s
            JOIN Users u ON s.userId = u.id
            WHERE u.id = ?
            """;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Student(
                    rs.getInt("studentId"),
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
            System.out.println("Get Student Error: " + e.getMessage());
        }
        return null;
    }

    // ================= GET ALL =================
    public ArrayList<Student> getAllStudents() {

        ArrayList<Student> list = new ArrayList<>();

        String sql = """
            SELECT s.id AS studentId, u.id AS userId, u.username, u.password,
                   s.fname, s.lname, s.email, s.phone
            FROM Students s
            JOIN Users u ON s.userId = u.id
            """;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                list.add(new Student(
                    rs.getInt("studentId"),
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
            System.out.println("Get All Students Error: " + e.getMessage());
        }
        return list;
    }

    public ArrayList<Student> getStudentsByInstructor(int instructorId) {

    ArrayList<Student> students = new ArrayList<>();

    String sql = """
        SELECT DISTINCT
            s.id,
            s.fname,
            s.lname,
            s.email,
            s.phone
        FROM Courses c
        JOIN Enrollments e ON c.id = e.courseId
        JOIN Students s ON e.studentId = s.id
        WHERE c.instructorId = ?
        """;

    try (Connection con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setInt(1, instructorId);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            students.add(new Student(
                rs.getInt("id"),
                rs.getString("fname"),
                rs.getString("lname"),
                rs.getString("email"),
                rs.getString("phone")
            ));
        }

    } catch (SQLException e) {
        System.out.println("Get Students By Instructor Error: " + e.getMessage());
    }

    return students;
}

    
    // ================= COUNT =================
    public int countStudents() {

        String sql = "SELECT COUNT(*) FROM Students";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) return rs.getInt(1);

        } catch (SQLException e) {
            System.out.println("Count Students Error: " + e.getMessage());
        }
        return 0;
    }
}
