
/**
 * This class have information about Modules and thethe credits module hold.
 *
 * @author Yamin hassan
 * @version (a version number or a date)
 */
public class Module
{
    public String module1;
    public String module2;
    public String module3;
    public String module4;
    public int module1Credits;
    public int module2Credits;
    public int module3Credits;
    public int module4Credits;
    
    
    public Module( String module1, int module1Credits, String module2, int module2Credits, String module3, int module3Credits, String module4, int modue4Credits )
    {
        this.module1=module1;
        this.module1Credits=module1Credits;
        this.module2=module2;
        this.module2Credits=module2Credits;
        this.module3=module3;
        this.module3Credits=module3Credits;
        this.module4=module4;
        this.module4Credits=module4Credits;
        
    }
    
    public String returnModule()
    {
    return module1;
    }
    public String returnModule2()
    {return module2;
    }
    public String returnModule3()
    {return module3;
    }
    public String returnModule4()
    {return module4;
    }           
        
    public int returnModule1Credits()
    {
        return module1Credits;
    }
    
     public int returnModule2Credits()
    {
        return module2Credits;
    }
    
     public int returnModule3Credits()
    {
        return module3Credits;
    }
    
     public int returnModule4Credits()
    {
        return module4Credits;
    }
}
