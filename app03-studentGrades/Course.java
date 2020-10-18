import java.util.ArrayList;

/** this class Course is created to add modules to it that the student can add course with modules
 * @ Author Yamin Hassan
 * @date creadted 12.10.2020
 * 
 */

 public class Course
 {
    private static final int CREDIT = 15;
    
    private String name;

    private String code;
    
    public ArrayList<Module> modules;
    
    private String grade;
    
    private int finalMark;
    
    private int credit;
    
    public Course(String  name, String  code)
    {
        this.name = name;
        this.code = code;
        
        modules= new ArrayList<Module>();
        finalMark = 0;
    }
    
    public String getGrade()
    {
        return grade;
    }
    
    public void addModule(Module newModule)
    {
        modules.add(newModule);
    }
 
    
    public String getCourseName()
    {
        return name;
    }
    
    public String getCourseCode()
    {
        return code;
    }
    
    public void printCourse()
    {
        System.out.println("The course name " + name + 
            " The Course Code " + code);
       
    }
        
    public void calculateFinalMark()
    {
        int total = 0;
        int mark = 0;
        
        //todo
        for(Module module : modules)
        {
            mark = module.getMark();
            System.out.println(module);
        }
    }
    
    public void convertToGrade()
    {
        if(finalMark >= 40 && finalMark < 50) 
        {
            grade = "D";
        }
        else if(finalMark >= 50 && finalMark < 60) 
        {
            grade = "C";
        }
        else if(finalMark >= 60 && finalMark < 70) 
        {
            grade = "B";
        }
        else if(finalMark >= 70 && finalMark < 100) 
        {
            grade = "A";
        }
        else
        {
            grade = "F";
        }
    }   
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    