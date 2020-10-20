import java.util.ArrayList;

/** this class Course is created to add modules to it that the student can add course with modules
 * @ Author Yamin Hassan
 * @date creadted 12.10.2020
 * 
 */

 public class Course
 {
   // Name of the course.
    private String name;
   // Code of the course.
    private String code;
    // mark of the modules.
    private int mark;
    // ArrayList of the modules.
    public ArrayList<Module> modules;
    // The grade attribte is created to award grades to the student.
    private String grade;
    // The finalMark is created to calculate final marks of the modules.
    private int finalMark;
    // The credit field is created to calculate the total credits.
    private int credit;
    /** The constructor assign name to name instace and code to code instance to return
     * values to the fields. The credits and mark is declared 0. the modules array is 
     * assigned to add modules.
     */
    public Course(String  name, String  code)
    {
        this.name = name;
        this.code = code;
        credit=0;
        mark=0;
        modules= new ArrayList<Module>();
        finalMark = 0;
    }
    // The returnCredit method is created to return credit.
     public int returnCredits()
    {
        return credit;
    }
    // The returnMark method returm the value hold by the field.
    public int returnMark()
    {
        return mark;
    }
    // The getFinalMark method returns finalMark's valur.
    public int getFinalMark()
    {
        return finalMark;
    }
    // The getCredit method returns gradde value.
    public String getGrade()
    {
        return grade;
    }
    // The addModule method is created to add module to the Array field.
    public void addModule(Module newModule)
    {
        modules.add(newModule);
    }
    // The getCourse method returns the name of the course.
    public String getCourseName()
    {
        return name;
    }
    //the getCourse method returns the code.
    public String getCourseCode()
    {
        return code;
    }
    // The printCourse method print the course details suc as name and code.
    public void printCourse()
    {
        System.out.println("The Course name: " + name + 
            ",  The Course Code: " + code);
           
       
    }
    
    public void printModule()
    { for(Module module : modules)
        {
            System.out.println(module);
        }
    }
    
    /** The calculateFinalMark method carry the mark and credit attained by the module
     * and add total mark and credit to calculate final grade. 
     */
    public void calculateFinalMark()
    {
        mark=0;
        finalMark=0;
        credit=0;
        
        
        for(Module module : modules)
        {
            mark += module.getMark();
            credit += module.returnCredit();
            finalMark = mark/4 ;
          
        }
        
    }
   
    
    /** The final marks need to convert to grade and the only conversion is appliable if student 
     * have acheive all four module
     */public void convertToGrade()
    {
               
        if (credit != 60)
        {
           
            System.out.println(" the student has not completed all four modules,"+ 
            "so the course is not able to provide final grades ");
        }
            
        else
        {
            if(finalMark >= 40 && finalMark < 50 ) 
            {
                grade = "D";
                System.out.println(" the Student has attain final mark: "+ finalMark + "%" +
                                    " and "+ "Grade: " + grade);
                            }
            else if(finalMark >= 50 && finalMark < 60) 
            {
            grade = "C";
            System.out.println(" the Student has attain final mark: "+ finalMark + "%" +
                                " and "+ "Grade: " + grade);
                            }
        
            else if(finalMark >= 60 && finalMark < 70) 
            {
                grade = "B";
                System.out.println(" the Student has attain final mark: "+ finalMark + "%" +
                                " and "+ "Grade: " + grade);
            
            
            
            } 
            else if(finalMark >= 70 && finalMark < 100) 
            {
                grade = "A";
                System.out.println(" the Student has attain final mark: "+ finalMark + "%" +
                                    " and "+ "Grade: " + grade);
            }
            else
            {
                grade = "F";
                System.out.println(" the Student has attain final mark: "+ finalMark + "%" +
                                " and "+ "Grade: " + grade);
            
            }
        }
   
    }
}
