package org.chapter_3;

public class GradeBook {
    private String courseName;
    private String instructorName;

    public GradeBook() {

    }

    public GradeBook(String courseName, String instructorName) {
        this.courseName = courseName;
        this.instructorName = instructorName;
    }

    public void displayMessage() {
        System.out.printf("Welcome to the Gradebook for \n%s!\n", getCourseName());
        System.out.println("This course is present by:" + getInstructorName());
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

}
