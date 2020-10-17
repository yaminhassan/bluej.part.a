
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
    // the amount of credits for study taken so far
    private int credits;
    
    private ArrayList<Course> courses;
    
    
   
    
    
    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String fullName, String studentID)
    {
        name = fullName;
        id = studentID;
        credits = 0;
       
        courses= new ArrayList<Course>();
        
        
        
    }
    
  
    
    
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
     * Add some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
    }

    
    /**
     * Return the number of credit points this student has accumulated.
     */
    public int getCredits()
    {
        return credits;
    }

   
    
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    
    {
       
        System.out.println();
    }
}
