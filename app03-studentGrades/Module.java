
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
    public String name;
    
    public String code;
   
    public int credit;
    // as a percentage
    public int mark;
    
    public Module( String name,  String code)
    {
        this.name = name;
        this.code = code;
        
        this.mark = 0;
        this.credit = 0;
    }
   
    /**
     * 
     */ 
    public int getMark()
    {
        return mark;
    }

   public void setMark(int mark)
   {
        if(mark > 100)
        {
            System.out.println("only 100 marks can be obtain by the student");
        }
        else
        {
            this.mark = mark;
        }
    }
    
    public String toString()
    {
        return "Module: " + name + "  " + code + 
            "Mark = " + mark;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getCode()
    {
        return code;
    }
}
