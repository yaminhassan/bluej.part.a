
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
        this.price=price;
        this.destination=destination;
        issueDateTime=new Date();
    }
    // the return method is invoked to check state of destinatio field.
    public String returnDestination()
    {return destination;
    }
    // The return method is invoked to check the state of price field.
    public int returnPrice()
    {
        return price;
    }
    public String toString()
{
    return destination+" "+price+" "+issueDateTime;
}
    // print method is executed to print the method of the Class.
    public void print()
    {
        System.out.print("Ticket " +destination+" "+"Price"+" "+
    price+" Pence "+ "Issue date: "+" " +issueDateTime);
}

}
