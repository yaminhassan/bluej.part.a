/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Yamin Hassan
 * @version 0.1
 */
public class StockApp
{
    // The ststic fields are created to called when need to call a method.
    public static final char CLEAR_CODE ='\u000C';
    public static final String QUIT = "quit";
    public static final String ADD = "add";
    public static final String PRINT="print";
    public static final String REMOVE = "remove";   
    public static final String CHANGE_NAME= "change name";
    public static final String SELL = "sell";
    public static final String RESTOCK = "restock";
    public static final String CHECK_LOW_STOCK= "low stock";
    public static final String SEARCH_PRODUCT = "search product";
    public static final String DELIVER_PRODUCT = "deliver product";
    
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
     * the getMenuChoices method provide user the commands can
     * be used to execute diffrent operations
     */
    public void getMenuChoice()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
            String choice=input.getInput();
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
    
    /**
     * the executeMenuChoice invoke the method to choose diffrent choices available
     * to user to execute a task.
     */
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
        else if(choice.equals(CHANGE_NAME))
        {
            changeName();
        }
        else if(choice.equals(SELL))
        {
            sellProduct();
        }
        else if(choice.equals(RESTOCK))
        {
            restock();
        }
        else if(choice.equals(CHECK_LOW_STOCK))
        {
            checkLowStock();
        }
        else if(choice.equals(SEARCH_PRODUCT))
        {
            searchProduct();   
        }
        else if(choice.equals(DELIVER_PRODUCT))
        {
            deliverProduct();
        }
        else
        {
            printMenuChoices();
            System.out.println(" Please type from one of the valid commands above");
            String newInput = input.getInput();
            executeMenuChoice(newInput);
            
        }
        
      
    }    
      
    /**
     * The search method search the product by
     * its name print it on the terminal.
     */
    public void searchProduct()
    {
        System.out.println("######### Search Product #######");
        System.out.println(" please entre product ID ");        
        int id = input.getIntegerInput();
        Product product = manager.findProduct(id);
        if(product != null)
            {
                manager.printProduct(id);                
            }
            else
            {
                System.out.println(" Product not found");           
            }
        System.out.println();
        printMenuChoices();
        String newInput = input.getInput();
        executeMenuChoice(newInput);
        
    }
    
    /**
     * method is design to find out if the products on the stock
     * fall below level of 4.
     */
    public void checkLowStock()
    {
        System.out.println("###### Stock is running low ############");
        System.out.println("## Stock in below quantity 4 ###########");
        System.out.println();
        manager.printLowStock();    
        String newInput = input.getInput();
        executeMenuChoice(newInput);
    }
    
    /**
     * the restock method invoke the method in stock Manger to replenish to 10 
     * if the level fell below 4 items.
     */
    public void restock()
    {
        manager.reStockLowStock();
        System.out.println();
        printMenuChoices();
        String newInput = input.getInput();
        executeMenuChoice(newInput);
    }
    
    /**
     * the selling method is design to sell product with its id
     * and if product is found it take quantity and execute the method.
     */
    public void sellProduct()
    {
        System.out.println("#########Selling product#######");
        System.out.println(" please entre product ID ");        
        int id = input.getIntegerInput();        
        Product product = manager.findProduct(id);
        if(product != null)
            {
                manager.printProduct(id);
                System.out.println("Please enter the quantity you would to sell");                 
                int quantity = input.getIntegerInput();
                manager.sellProduct(id, quantity);
            }
            else
            {
                System.out.println(" Product not found");      
            }              
        System.out.println();
        printMenuChoices();
        String newInput = input.getInput();
        executeMenuChoice(newInput);        
    }
    
    /**
     * the change name method find the product by name and 
     * if find it replace it with new name.
     */
    public void changeName()
    {
        System.out.println(" Change product name");
        System.out.println("Enter the product id");               
        int id = input.getIntegerInput();        
        System.out.println("Enter new Name");
        String name = input.getInput();
        manager.changeProductName(id,name);       
        System.out.println();
        printMenuChoices();
        String newInput = input.getInput();
        executeMenuChoice(newInput);          
    }
    
    /**
     * the add quantity method increment the stock level by user in put.
     * firstly it find product by id and if find take input
     */
    public void deliverProduct()
    {
        System.out.println("Please enter product id");              
        int id =input.getIntegerInput();        
        Product product = manager.findProduct(id);
        if(product!=null)
            {
                System.out.println(product);
                System.out.println(" Please Enter quantity");                
                int quantity = input.getIntegerInput();
                product.increaseQuantity(quantity);
                System.out.println(product);
                System.out.println();                
            }
            else
            {
                System.out.println(" product not found please enter valid id");                 
                deliverProduct();
            }        
        System.out.println();
        printMenuChoices();
        String newInput = input.getInput();
        executeMenuChoice(newInput);        
    }
    
    /**
     * the print all method print all products on
     * database on the terminal.
     */
    public void printAll()
    {
        manager.printProductDetails();
        String printNewInput = input.getInput();
        executeMenuChoice(printNewInput);
    }
    
    /**
     * the remove method locate the product by its id and
     * if found it remove it from database.
     */
    public void removeProduct()
    {
        System.out.println(" Remove product");
        System.out.println("Enter Product id");               
        int id = input.getIntegerInput();
        Product product = manager.findProduct(id);
        if(product !=null)
            {
                manager.removeProduct(id);
            }
            else
            {
                System.out.print("Please eneter valid product id; try  again");
                removeProduct();
            }        
        System.out.println();
        printMenuChoices();
        String newInput = input.getInput();
        executeMenuChoice(newInput); 
    }
    
    /** Add product method add new products to the stock
     * it take and id and a name and add it the stoke manger.
     */
    public void addProduct()
    {
        System.out.println(" Add new product");        
        System.out.println("Enter product Id");                     
        int id = input.getIntegerInput();
        System.out.println( "Enter product name");
        String name = input.getInput();
        if(name.isEmpty())
            {
                System.out.println( "Product name can't be blank");
                addProduct();
            }
            else
            {                
                Product product = new Product(id, name);        
                manager.addProduct(product);
            }       
        System.out.println();
        printMenuChoices();
        String newInput = input.getInput();
        executeMenuChoice(newInput);
    }
    
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println("########### Add:   Add a new product ####################");
        System.out.println("######## Remove:   Remove an old product ################");
        System.out.println("######### Print:   Print all products ###################");
        System.out.println("########## Sell:   Sell existing products ###############");
        System.out.println("### Change name:   Change name of existing products #####");
        System.out.println("Deliver product:   Add quantity of existing products ####");
        System.out.println("########## Quit:   Quit from the program and exit #######");
        System.out.println("####### Restock:   Restock all low level stock ##########");
        System.out.println("##### Low stock:   Check low stock with quantity ########");
        System.out.println(" Search Product:   Search product with its name #########");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println(CLEAR_CODE);
        System.out.println("****************************************** ");
        System.out.println("        Stock Management Application       ");
        System.out.println("        App05: by Yamin Hassan             ");
        System.out.println("****************************************** ");
       
    }
}
