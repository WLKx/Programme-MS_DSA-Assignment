/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author wong-
 */
public class Course implements Comparable<Course>{
    private String CourseName;
    private String CourseCode;
    private int CreditHours;

    public Course(){

    }
    
    public Course(String CourseName, String CourseCode, int CreditHours) {
        this.CourseName = CourseName;
        this.CourseCode = CourseCode;
        this.CreditHours = CreditHours;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String CourseCode) {
        this.CourseCode = CourseCode;
    }

    public int getCreditHours() {
        return CreditHours;
    }

    public void setCreditHours(int CreditHours) {
        this.CreditHours = CreditHours;
    }

    @Override
    public String toString() {
        return "Course Name  = " + CourseName + 
               "\nCourse Code  = " + CourseCode + 
               "\nCredit Hours = " + CreditHours + "\n";
    }

    @Override
    public int compareTo(Course o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
