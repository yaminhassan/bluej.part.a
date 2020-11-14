
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Student Name
 * @version 0.1
 */
public class StockApp
{
    // Use to get user input
    public static final char CLEAR_CODE ='\u000C';
    public static final String QUIT = "quit";
    public static final String ADD = "add now";
    public static final String PRINT = "print";
    public static final String REMOVE = "remove";
    public static final String ADDQUANTITY = "add quantity";
    
    
    private InputReader input;
    private StockManager manager = new StockManager();
    private StockDemo demo = new StockDemo(manager);
   
    
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
    }

    
    
    /**
     * 
     */
    public void getMenuChoice()
    {
        
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
            String choice=input.getInput(). toLowerCase();
            
            if(choice.equals(QUIT))
            {
                finished = true;
            }
            else
            {
                 executeMenuChoice(choice);
            }
            
            
            
        }
    }
    
    private void executeMenuChoice(String choice)
    {
        if(choice.equals(ADD))
        {
           addProduct();
        } 
        
        else if(choice.equals(PRINT))
        {
            printAll();
            
            
        }
        else if(choice.equals(REMOVE))
        {
            removeProduct();
           
        }
        else if(choice.equals(ADDQUANTITY))
        {
            addQuantity();
        }
        
    }
    public void addQuantity()
    {
        System.out.println("Please enter product id");
        String value = input.getInput();
        int id = Integer.parseInt(value);
        Product product = manager.findProduct(id);
        System.out.println(product);
        System.out.println(" Please Enter quantity");
        String amount = input.getInput();
        int quantity = Integer.parseInt(amount);
        product.increaseQuantity(quantity);
        manager.printProduct(id);
        
        String newInput = input.getInput();
        executeMenuChoice(newInput);
        
        
        
    }
    
    public void printAll()
    {
        manager.printProductDetails();
        String printNewInput = input.getInput();
        executeMenuChoice(printNewInput);
    }
    public void removeProduct()
    {
        System.out.println(" Remove product");
        System.out.println("Enter Product id");
        
        String value = input.getInput();
        int id = Integer.parseInt(value);
        manager.printProduct(id);
        manager.removeProduct(id);
        
        String removeNewInput = input.getInput();
        executeMenuChoice(removeNewInput);
        
        
        
    }
    
    public void addProduct()
    {
        System.out.println(" Add new product");
        
        System.out.println("Enter product Id");
        
        String value = input.getInput();
        int id = Integer.parseInt(value);
        
        System.out.println( "Enter product name");
        String name = input.getInput();
        
        Product product = new Product(id, name);
        manager.addProduct(product);
        
        System.out.println(product);
        String addNewInput = input.getInput();
        executeMenuChoice(addNewInput);
        
        
        
        
        
        
    }
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println(CLEAR_CODE);
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Yamin Hassan");
        System.out.println("******************************");
       
    }
}
