package model;

public class Instructor extends User {

    private int instructorId;
    private String fname, lname, email, phone;
    
    public Instructor(int userId, String username, String password) {
        super(userId, username, password, "instructor");
    }


    public Instructor(String username, String password,
                      String fname, String lname,
                      String email, String phone) {

        super(0, username, password, "instructor");
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
    }

    public Instructor(int instructorId, int userId,
                      String username, String password,
                      String fname, String lname,
                      String email, String phone) {

        super(userId, username, password, "instructor");
        this.instructorId = instructorId;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        
        
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override public String getHomeWindow() { return "InstructorDashboard"; }
    @Override public String getPermissions() { return "Teach | Grade"; }
    @Override public String getRoleDescription() { return "Instructor"; }
}
