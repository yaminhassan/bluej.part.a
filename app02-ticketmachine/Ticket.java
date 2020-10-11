
/**
 * the Class Ticket is genertaed to give value to the tickets 
 *
 * @author Yamin Hassan
 * @version 9th October 2020
 */
import java.util.Date;


public class Ticket
{
    // instance variables - replace the example below with your own
    public int price;
    private String destination;
    private Date issueDateTime;  

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String destination, int price)
    {
       
        this.destination=destination;
        issueDateTime=new Date();
    }
    
    public Ticket(int price)
    {
        this.price=price;
    }
    public int getPrice()
    {return price;
    }
    public String returnDestination()
    {return destination;
    }
    
    public int returnPrice()
    {
        return price;
    }
   
    public String toString()
{
    return destination+" "+price+" "+issueDateTime;
}
    public void print()
    {
        System.out.print("Ticket " +destination+" "+"Price"+" "+
    price+" Pence "+ "Issue date: "+" " +issueDateTime);
}

}
