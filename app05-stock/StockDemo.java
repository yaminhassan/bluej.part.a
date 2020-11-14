import java.util.*;


/**
 * Demonstrate the StockManager and Product classes.
 * The class can store the products of the array list and can delive
 * @author Yamin Hassan
 * @revised 26.10.2020
 */
public class StockDemo
{
    // The stock manager.
    private StockManager  manager;
    
    /**
     * Create a StockManager and populate it with ten sample
     * products
     */
    public StockDemo(StockManager manager)
    {
        this.manager=manager;
        manager.addProduct(new Product(132, "Clock Radio"));
        manager.addProduct(new Product(89,  "Mobile Phone"));
        manager.addProduct(new Product(23,  "Microwave Oven"));
        manager.addProduct(new Product(37,  "Sony Tv"));
        manager.addProduct(new Product(42, "Toshiba TV"));
        manager.addProduct(new Product(45, " Samsung TV"));
        manager.addProduct(new Product(55, "LG TV"));
        manager.addProduct(new Product(88, "Apple TV"));
        manager.addProduct(new Product(99, "Toshiba Walkman"));
        manager.addProduct(new Product(78, " Samsung Sond System"));
    }
    
    /**
     * The stokeDemo's demoDelivery method demonstrate that
     * it can find the product and increase with its quantity 
     * with the delivery and restock it.
     */
    public void demoDelivery()
    {
        // Take delivery of 5 items of one of the products.
        manager.delivery(132,5);
        manager.delivery(37, 5);
        manager.delivery(23, 5);
        manager.delivery(42, 5);
        manager.delivery(45, 5);
        //take delivery of 10 items of one of the products.
        manager.delivery(55, 10);
        manager.delivery(88, 10);
        manager.delivery(99, 10);
        manager.delivery(78, 10);
    }
    
    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int id, int sell)
    {
        Product product = getProduct(id);
        if(product != null) 
        {
            showDetails(id);
            product.sellProduct(sell);
            printTrader();
            showDetails(id);
        }
    }
    
    /** 
     * the method can determine the quantity of
     * the precise product in stock.
     */
    public void productQuantity(int id)
    {
        Product product = manager.findProduct(id);
        if(product!=null)
        {
            System.out.println(product.getQuantity());
        }
        else
        {
            System.out.println(" The product not found try valid Id");
        }
    }
        
    /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void showDetails(int id)
    {
        Product product = manager.findProduct(id);        
        if(product != null) 
        {
            {
                System.out.println(product.toString());
            }
        }
        else
        {
            System.out.println("Product not found");
        }
    }
    
    public void printTrader()
    {
        System.out.println("********** Yamin Traders and Supplies*********"+
                            "*********************************************"+
                            "*********************************************"+
                            "*********************************************");
    }
    
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
   
}
