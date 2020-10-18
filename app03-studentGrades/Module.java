
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class have information about Modules and thethe credits module hold.
 *
 * @author Yamin hassan
 * @version (a version number or a date)
 */
public class Module
{
    public String moduleName;
    
    public String moduleCode;
   
    public int percentageMarks;
    
    
    
    
    
    public Module( String moduleName,  String moduleCode, int percentageMarks)
    {
        this.moduleName=moduleName;
        this.moduleCode=moduleCode;
        
        this.percentageMarks=percentageMarks;
        
        
       
        
        
      
    }
    
        

        
   public int returnMarks()
   {return percentageMarks;
    }
    

    public void addMarks(int addMarks)
    {
        if(percentageMarks>100)
        {System.out.println("only 100 marks can be obtain by the student");
            
    }
    else
    {
        percentageMarks=addMarks;
        
    }
}

    
    
    public String toString()
    {
        return moduleName+"  "+moduleCode;
    }
    
    
    
    public String returnModuleName()
    {
        return moduleName;
    }
    
    public String returnModuleCode()
{
    return moduleCode;
}
    

   
}
