package model;

public class Admin extends User {

    public Admin() {
        super();
        this.setRole("admin");
    }

    
    // From DB (login / select)
    public Admin(int userId, String username, String password) {
        super(userId, username, password, "admin");
    }
    
    

    // Before insert (optional)
    public Admin(String username, String password) {
        super(0, username, password, "admin");
    }

    @Override
    public String getHomeWindow() {
        return "AdminDashboard";
    }

    @Override
    public String getPermissions() {
        return "FULL_ACCESS";
    }

    @Override
    public String getRoleDescription() {
        return "System Administrator";
    }
}
