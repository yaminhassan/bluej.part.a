
import java.util.ArrayList;
/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2016.02.29
 * @edited by Yamin hassan ID: 22013824
 */


public class Student
{    
     // the student's full name
     private String name;
     // the student ID
     private String id; 
     // the courses Array list is created to enroll student to the course
     private ArrayList<Course> courses;
   
    /**
     * Create a new student with a given name, ID number and ArrayList to add course to
     * student.
     */
    public Student(String fullName, String studentID)
    {
        name = fullName;
        id = studentID;
        courses= new ArrayList<Course>();
    }
    // Add course method is created to add course to student.
    public void addCourse(Course newCourse)
    {
        courses.add(newCourse);
    }

    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Return the student ID of this student.
     */
    public String getStudentID()
    {
        return id;
    }

    /**
     * Print the student's final mark, grade, and modules  to the output terminal.
     */
    public void printFinalGrade()
    {
        
        for( Course mark : courses)
        {
        System.out.println("the Student's final grade is: " + mark.getGrade() +
        " , the final mark of the Student is: " + mark.getFinalMark() +"%");
        }
    }
    // Print student details includs name and id on the terminal.
    public void printStudentDetails()
        {
        System.out.println(" Student name: " + name + " " + ", Student Id: " + id);
        }
}
