import java.util.ArrayList;
/**
 * This class have information about Modules and thethe credits module hold.
 *
 * @author Yamin hassan
 * @version (a version number or a date)
 */
public class Module
{
    public String moduleName;
    
    public int moduleCode;
    
    private ArrayList<Module> grades;
    private String grade;
    
    private static final int CREDITS=15;
    private int marks;
    private int creditScore;
    
    
    
    public Module( String moduleName,  int modueCode)
    {
        this.moduleName=moduleName;
        this.moduleCode=moduleCode;
        grades=new ArrayList<Module>();
        
        creditScore=0;
        
        marks=0;
       
        
        
      
    }
    
    public int returnCredits()
{return CREDITS;
}
    public void addMarks(int addMarks)
    {
        if(marks>100)
        {System.out.println("only 100 marks can be obtain by the student");
            
    }
    else
    {
        marks=addMarks;
        
    }
}

    public void addCredits()
    {
        if(marks>39 && marks<48) 
        {grade="A";
          creditScore=CREDITS;
          System.out.println("Student Credit score is "+creditScore+" "+"and the student have attain Grade "+grade);
            
         
        }
        else if (marks>49 && marks<58)
        {grade="B";}
        else if(marks>59)
        {grade="C";}
        else 
        {grade="D";}
        
    }
    
    

    
    
    
    
    
    public String returnModuleName()
    {
        return moduleName;
    }
    
    public int returnModuleCode()
{
    return moduleCode;
}
    
    
}
