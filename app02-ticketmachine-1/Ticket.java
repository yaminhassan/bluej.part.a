
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
    private int ticketPrice;
    private String destinationName;
    private Date issueDateTime;  

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String destination, int price)
    {
       
        this.destinationName=destination; 
        this.ticketPrice=price;
        issueDateTime=new Date();
    }
    
    public Ticket(String destination)
    {
      this.destinationName=destination; 
       
    }
    public String getDestinationName() 
    {
return destinationName;
}
    
    public void setDestinationName(String aylsbury) {
this.destinationName = aylsbury;
}
public Ticket(int price)
{
    this.ticketPrice=price;
}

public int getTicketprice()
{
    return ticketPrice;
}

public void setTicketPrice(int ticketPrice)
{
    this.ticketPrice=ticketPrice;
}

    public void print()

    {
        System.out.print("Ticket " +destinationName+" "+"Price"+" "+
    ticketPrice+" Pence "+ "Issue date: "+" " +issueDateTime);
}

}
