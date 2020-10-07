
/**
 * Write a description of class Course here.
 *
 * @author Derek Peacock
 * @version (a version number or a date)
 * Modified by Yamin Hassan
 */
public class Course
  {
    // the attributes of the class are title and code
     public String  title;
     public String code;
    
     //the attribute variable assiged values by strings
     public Course(String newTitle, String newCode)
  {
        title=newTitle;
        code=newCode;
  }
    
     
  // tostring method used to assign strings
  public String toString()
  {
        return "title is: " + title + " and code is: " + code;
  }
    
   
        
        
        
            
        
        

}