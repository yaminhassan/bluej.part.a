
import java.util.ArrayList;
/**
 * This class have information about Modules and thethe credits module hold.
 * @author Yamin hassan
 * @version 19.10.2020
 */
public class Module
{
    // the module name field.
    public String name;
    //the module code field.
    public String code;
    // The credit awarded to module field.
    public int credit;
    // the percentage mark field.
    public int mark;
    /** The construction method is created to creat objects name and code and also to give value to mark and credit starting value.
     * 
     */
    public Module( String name,  String code)
    {
        this.name = name;
        this.code = code;
        
        this.mark = 0;
        this.credit = 0;
    }
   
    /** The return method is invoked to return marks.
     */ 
    public int getMark()
    {
        return mark;
    }

    /** The set method is invoked to give marks to the module  
    */
    public void setMark(int mark)
    {
        if(mark > 100)
        {
            System.out.println("only 100 mark can be obtain by the student");
        }
        
        else if(mark >0 && mark < 100 )
        {
            this.mark = mark;
        }
       
        else
        {
            this.mark=0;
        }
    }
    // The tostring method is invoked to print values of module and code.
    public String toString()
    {
        return "Module: " + name + " , " + "Code " + code + " " +
            ", Mark = " + mark +"%";
    }
    // The return method is invoked to return course name.
    public String getName()
    {
        return name;
    }
    // The return method is invoked to return course code.
    public String getCode()
    {
        return code;
    }
    // The returnCredit method is invoked to set a perimeter to assign credits to module,
    public int returnCredit()
    {   credit = 0;
        if(mark >= 40)
        {
            credit = 15;
        }
        return credit;
    }
    public void printModule()
    {
        System.out.println(" The Module name: " + name + ",  Module code: " + code);
    }
}
