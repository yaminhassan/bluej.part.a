import java.util.ArrayList;
/** this class Course is created to add modules to it that the student can add course with modules
 * @ Author Yamin Hassan
 * @date creadted 12.10.2020
 * 
 */

 public class Course
 {
    
    private String courseName;
    private String courseCode;
    
    public  ArrayList<Module> modules;
   
    
    public Course(String courseName, String courseCode)
    {
        this.courseName=courseName;
        this.courseCode=courseCode;
        
        modules= new ArrayList<Module>();
        
        
        
        
        
    }
    
    public void addModule(Module newModule)
    {
        modules.add(newModule);
    }
 
    
    public String getCourseName()
    {
        return courseName;
    }
    
    public String gerCourseCode()
    {
        return courseCode;
    }
    
    

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    