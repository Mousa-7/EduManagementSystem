package model;

public class Course {
    private int courseId;
    private String title;
    private String description;
    private int instructorId;

    public Course(int courseId, String title,
                    String description, int instructorId) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.instructorId = instructorId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }
    
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    

    public int getCourseId() { return courseId; }
    public int getInstructorId() { return instructorId; }
}
