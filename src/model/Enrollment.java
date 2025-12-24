package model;

public class Enrollment {
    private int enrollId;
    private int studentId;
    private int courseId;
    private String grade;

    public Enrollment() {}

    public Enrollment(int enrollId, int studentId, int courseId, String grade) {
        this.enrollId = enrollId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.grade = grade;
    }

    public int getEnrollId() { return enrollId; }
    public void setEnrollId(int enrollId) { this.enrollId = enrollId; }

    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }

    public int getCourseId() { return courseId; }
    public void setCourseId(int courseId) { this.courseId = courseId; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
}