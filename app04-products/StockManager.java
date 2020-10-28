import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @mdifiedBy Yamin hassan 
 * @version 26.10.2020
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;
    

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<Product>();
    }
    
    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);        
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        Product product = findProduct(id);
        {
            if(product != null)
            {
                product.increaseQuantity(amount);
                product.getQuantity();
            }
            else
            {
                System.out.println(" Please add stock in positive numbers");
            }
        }
    }
       
     /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printProduct(int id)
    {
        Product product = findProduct(id);        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
         
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for(Product product : stock)
        {
            if(product.getID() == id)
            {
                return product;            
            }
        }
        return null;
    }
    
    /** If the name of the product is need to be changed, invoke this method to change the name of the product.
     */
    public void changeProductName(int id, String replacement)
    {
        Product product = findProduct(id);
        if(product != null)
        {
            product.replaceName(replacement);
        }
        else
        {
            System.out.println( " The product not found on the database");
        }
    }
        
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public void numberInStock(int id)
    {
        Product product = findProduct(id);
        if(product != null)
        {
            product.getQuantity();
            System.out.println(" The stock quantity is :" + product.getQuantity());         
        }
        else
        {
            System.out.println(" The system does not find the product");
        }
    }

    /**
    * Print details of all the products.
    */
    public void printProductDetails()
    {
        for(Product stocks : stock)
        System.out.println(stocks);
    }
    
    /** If product is not anymore part of the stock the method is to remove it from Array list. 
     */
    public void removeProduct(int id)
    {
        Product product = findProduct(id);
        if(product != null)
        {
            stock.remove(product);
            System.out.println("The product has been removed.");         
        }
        else
        {
            System.out.println(" The system does not find the product");
        }
    } 
    
    /** Find the product with its name
    * and print it on the terminal.
    */
    public Product findProductName(String productName)
    {
        for( Product product : stock)
        {
            if(product.getName() == productName)
            {
                return product;
            }
            else
            {
                System.out.println(" Product not found");
            }
        }
        return null;
    }
}
