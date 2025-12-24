package model;

public class Student extends User {

    private int studentId;
    private String fname, lname, email, phone;

    public Student(int userId, String username, String password) {
        super(userId, username, password, "student");
    }

    public Student(int studentId,
               String fname,
               String lname,
               String email,
               String phone) {

    this.studentId = studentId;
    this.fname = fname;
    this.lname = lname;
    this.email = email;
    this.phone = phone;
}

    
    // Insert
    public Student(String username, String password,
                   String fname, String lname,
                   String email, String phone) {

        super(0, username, password, "student");
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
    }

    // From DB
    public Student(int studentId, int userId,
                   String username, String password,
                   String fname, String lname,
                   String email, String phone) {

        super(userId, username, password, "student");
        this.studentId = studentId;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    

    @Override public String getHomeWindow() { return "StudentDashboard"; }
    @Override public String getPermissions() { return "View | Enroll"; }
    @Override public String getRoleDescription() { return "Student"; }
}
