/**
 * The product class can creat instances of a prooduct.
 *  The product contain name, id and the quantity.
 *  @modifiedBy  Yamin Hassan
 * @version 2020.10.26
 */
public class Product
{
    // An identifying number for this product.
    private int id;
    // The name of this product.
    private String name;
    // The quantity of this product in stock.
    private int quantity;
    
    /**
     * Constructor for objects of class Product.
     * The initial stock quantity is zero.
     * @param id The product's identifying number.
     * @param name The product's name.
     */
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
        quantity=0;        
    }

    /**
     * @return The product's id.
     */
    public int getID()
    {
        return id;
    }
   
    /**
     * @return The product's name.
     */
    public String getName()
    {
        return name;
    }
    
    
    /**
     * This method can change the name of te product with
     * replaced name.
     */
    public void replaceName(String name)
    {
        this.name = name;
    }

    /**
     * return The quantity in stock.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * @return The id, name and quantity in stock.
     */
    public String toString()
    {
        return id + ": " +  name + " stock level: " + getQuantity();
    }

    /**
     * Restock with the given amount of this product.
     * The current quantity is incremented by the given amount.
     * @param amount The number of new items added to the stock.
     *               This must be greater than zero.
     */
    public void increaseQuantity(int amount)
    {
        if(amount > 0) 
        {
            quantity += amount;
        }
        else 
        {
            System.out.println(" ####### Please enetr positive value");
        }
    }

    /**
     * Sell one of these products.
     * An error is reported if there appears to be no stock.
     */
    public void sellProduct(int sale)
    {
        if(quantity >= sale && sale > 0) 
        {
            quantity -= sale;
        }
        else if( sale < 0) 
        {
            System.out.println(" #### Please enetr positive number");
        }
        else if(sale > quantity)
        {
            System.out.println(" #### Please do not order more than stock level thanks "
            + "the required amount: " + sale+ " is more than stock: " + getQuantity() );
        }
        else if(quantity == 0)
        {
            System.out.println(name + " is not in stock");
        }
    }
}
