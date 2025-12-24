package dao;

import java.sql.*;
import java.util.ArrayList;
import model.Course;
import util.DBConnection;

public class CourseDao {

    // ================= ADD =================
    public boolean addCourse(Course c) {

        String sql =
            "INSERT INTO Courses(title, description, instructorId) VALUES (?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, c.getTitle());
            ps.setString(2, c.getDescription());
            ps.setInt(3, c.getInstructorId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Add Course Error: " + e.getMessage());
            return false;
        }
    }

    // ================= GET ALL =================
    public ArrayList<Course> getAllCourses() {

        ArrayList<Course> list = new ArrayList<>();

        String sql = "SELECT * FROM Courses";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                list.add(new Course(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("description"),
                    rs.getInt("instructorId")
                ));
            }

        } catch (SQLException e) {
            System.out.println("Get Courses Error: " + e.getMessage());
        }
        return list;
    }

    // ================= DELETE =================
    public boolean deleteCourse(int courseId) {

        String sql = "DELETE FROM Courses WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, courseId);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Delete Course Error: " + e.getMessage());
            return false;
        }
    }

    public ArrayList<Course> getCoursesByInstructor(int instructorId) {

        ArrayList<Course> courses = new ArrayList<>();

        String sql = "SELECT * FROM Courses WHERE instructorId = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, instructorId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                courses.add(new Course(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("description"),
                    rs.getInt("instructorId")
                ));
            }

        } catch (SQLException e) {
            System.out.println("Get Instructor Courses Error: " + e.getMessage());
        }

        return courses;
    }

    
    // ================= COUNT =================
    public int countCourses() {

        String sql = "SELECT COUNT(*) FROM Courses";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) return rs.getInt(1);

        } catch (SQLException e) {
            System.out.println("Count Courses Error: " + e.getMessage());
        }
        return 0;
    }
}
