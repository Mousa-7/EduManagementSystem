package dao;

import java.sql.*;
import java.util.ArrayList;
import util.DBConnection;
import model.*;







public class UserDao {

    // ================= ADD USER =================
    public boolean addAdmin(User user) {
        String query = "INSERT INTO Users(username, password, role) VALUES (?, ?, ?)";
        
        try (Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) { 
            
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword()); 
            ps.setString(3, "admin");
            
            return ps.executeUpdate() > 0; 
        } catch (SQLException x) {
            System.out.println("Add admin Error: " + x.getMessage());
            return false; 
        } 
    }

    // ================= UPDATE USER =================
    public boolean updateUser(User user) {

        String sql = "UPDATE Users SET username=?, password=? WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setInt(3, user.getUserId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Update User Error: " + e.getMessage());
            return false;
        }
    }

    // ================= DELETE USER =================
    public boolean deleteUser(int userId) {

        String sql = "DELETE FROM Users WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, userId);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Delete User Error: " + e.getMessage());
            return false;
        }
    }

    // ================= LOGIN =================
    public User login(String username, String password) {

        String sql = "SELECT id, role FROM Users WHERE username=? AND password=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            if (!rs.next()) return null;

            int userId = rs.getInt("id");
            String role = rs.getString("role");

            switch (role) {
                case "admin":
                    return new Admin(userId, username, password);

                case "student":
                    return new StudentDao().getStudentByUserId(userId);

                case "instructor":
                    return new InstructorDao().getInstructorByUserId(userId);
            }

        } catch (SQLException e) {
            System.out.println("Login Error: " + e.getMessage());
        }
        return null;
    }

    // ================= GET USER BY ID =================
    public User getUserById(int userId) {

        String sql = "SELECT username, password, role FROM Users WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String role = rs.getString("role");

                if (role.equals("admin"))
                    return new Admin(userId, username, password);

                if (role.equals("student"))
                    return new StudentDao().getStudentByUserId(userId);

                if (role.equals("instructor"))
                    return new InstructorDao().getInstructorByUserId(userId);
            }

        } catch (SQLException e) {
            System.out.println("Get User Error: " + e.getMessage());
        }
        return null;
    }

    public User getUserByUsername(String username) {

        String sql = "SELECT id, username, password, role FROM Users WHERE username = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            if (!rs.next()) {
                return null; // user not found
            }

            int userId = rs.getInt("id");
            String password = rs.getString("password");
            String role = rs.getString("role");

            if (role.equalsIgnoreCase("admin")) {
                return new Admin(userId, username, password);

            } else if (role.equalsIgnoreCase("student")) {
                return new Student(userId, username, password);

            } else if (role.equalsIgnoreCase("instructor")) {
                return new Instructor(userId, username, password);
            }

        } catch (SQLException e) {
            System.out.println("Get User By Username Error: " + e.getMessage());
        }

        return null;
    }

    
    // ================= GET ALL USERS =================
    public ArrayList<User> getAllUsers() {

        ArrayList<User> users = new ArrayList<>();
        String sql = "SELECT id, username, password, role FROM Users";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String role = rs.getString("role");

                if (role.equals("admin"))
                    users.add(new Admin(id, username, password));
                else if (role.equals("student"))
                    users.add(new StudentDao().getStudentByUserId(id));
                else if (role.equals("instructor"))
                    users.add(new InstructorDao().getInstructorByUserId(id));
            }

        } catch (SQLException e) {
            System.out.println("Get All Users Error: " + e.getMessage());
        }
        return users;
    }

    // ================= USER EXISTS =================
    public boolean userExists(String username) {

        String sql = "SELECT id FROM Users WHERE username=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, username);
            return ps.executeQuery().next();

        } catch (SQLException e) {
            System.out.println("User Exists Error: " + e.getMessage());
            return false;
        }
    }

    // ================= COUNT USERS =================
    public int countUsers() {

        String sql = "SELECT COUNT(*) FROM Users";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) return rs.getInt(1);

        } catch (SQLException e) {
            System.out.println("Count Users Error: " + e.getMessage());
        }
        return 0;
    }
}
