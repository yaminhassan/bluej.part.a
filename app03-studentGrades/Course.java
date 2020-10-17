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
    public Module marks;
   
    public int credits;
    public int attainCredits;
    private static final int CREDITS=15;
    
    private String grade;
   
    
    public Course(String  courseName, String  courseCode, Module marks)
    {
        this.courseName=courseName;
        this.courseCode=courseCode;
        this.marks=marks;
        
        modules= new ArrayList<Module>();
        credits=0;
        attainCredits=0;
        
        
        
        
        
        
        
        
        
        
    }
    
    public void addsomr()
    {System.out.println(marks.returnMarks());
        
    }
    
        public int returnTotalCredits()
        {
            return credits;}
            
            
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
    
    public void printCourse()
    {
        System.out.println("the course name "+courseName+" "+"The Course Code "+courseCode+"  "+modules);
       
        }
        
     public void addCredits()
    {
        if(marks.returnMarks()>40 && marks.returnMarks()<49) 
        {grade="D";
          attainCredits=CREDITS;
          
          System.out.println("Student Credit score is "+attainCredits+" "+"and the student have attain Grade "+grade);
            
         
        }
       
        else if(marks.returnMarks()>50 && marks.returnMarks()<59)
        {grade="C";
        attainCredits=CREDITS;
        }
         else if(marks.returnMarks()>60 && marks.returnMarks()<69)
        {grade="B";
        attainCredits=CREDITS;}
         else if(marks.returnMarks()>70 && marks.returnMarks()<100)
        {grade="A";
        attainCredits=CREDITS;}
        else 
        {grade="F";
        attainCredits=0;}
        
        
        
        
        
        
    }   
          

    

}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    