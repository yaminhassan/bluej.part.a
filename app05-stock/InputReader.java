import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @edited     Yamin Hassan
 * @version    0.1 (2016.02.29)
 */
public class InputReader
{
    private Scanner reader;
    private Scanner integerReader;
    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
        integerReader = new Scanner(System.in);
    }    
    
    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public String getInput()
    {
        System.out.print("> ");         // print prompt
        
        String inputLine = reader.nextLine().trim().toLowerCase();
        
        return inputLine;
        
        
    }  
    public int getIntegerInput()
    {
        int number = 0;
         boolean valid = false;
          
       while (!valid)
        {
       String string = getInput();
        try
        {
            number = Integer.parseInt(string);
            valid = true;
        }
        catch(Exception e)
        {
            System.out.println("not a number");
            
        }
        }
        return number;
        
        
    }
}
