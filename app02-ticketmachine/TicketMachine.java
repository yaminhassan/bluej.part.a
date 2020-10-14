/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Yamin Hassan 
 */
import java.util.Scanner;
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    // the Coin class to add coins to the machine
    public Coin value;
    // issued ticket instance generated to invoke the method to issue the ticket 
    private Ticket issuedTicket;
    // the call aylesburyTicket, amershamTicket and highwycombe state in ticket class
    private Ticket aylesburyTicket;
    private Ticket amershamTicket;
    private Ticket highWycombeTicket;
    // the AYLESBURY_TICKET_PRICE,  AMERSHAM_TICKET_PRICE and HIGH_WYCOMBE_TICKET field are declared to give static value.
    public static final int AYLESBURY_TICKET_PRICE=220;
    
    public static final int AMERSHAM_TICKET_PRICE=300;
    
    public static final int HIGH_WYCOMBE_TICKET_PRICE=330;
    
    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        // balance is declared in main method to express the value of the object state
        balance = 0;
        // the total object is declared value 0 to state its state
        total = 0;
        // Aylesbury, Amersham and High wycombe ticket details need to print on ticket through mathod declared in Ticket class
        aylesburyTicket= new Ticket("Aylesbury", 220);
        amershamTicket= new Ticket("Amersham" , 300);
        highWycombeTicket=new Ticket("HighWycombe", 330);
        
        
        // issued tiket field needed to invoke the function to set values for ticket and print field of ticket details
        issuedTicket = null;
    }
   
  
    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }
    //Return Aylsbury ticket price
    public int returnAylesburyTiketPrice()
    {return AYLESBURY_TICKET_PRICE;
    }
      
    // Select thw Aylesbury ticket to issue it
    public void selectAylesburyTicket()
    {
        issuedTicket = aylesburyTicket;
        price=AYLESBURY_TICKET_PRICE;
    }
    // Return amersham ticket price to return value
    public int returnAmershamTicketPrice()
    {
    return AMERSHAM_TICKET_PRICE;
    }
    // Select the Amersham ticket to issue it 
    public void selectAmershamTicket()
    {
    issuedTicket=amershamTicket;
    price=AMERSHAM_TICKET_PRICE;
    }
    // Return High Wycombe ticket price
    public int returnHighWycombeTicketPrice()
    {
        return HIGH_WYCOMBE_TICKET_PRICE;
    }
    
    // Select High Wycombe ticket
    public void selectHighWycombeTicket()
    {
        issuedTicket=highWycombeTicket;
        price=HIGH_WYCOMBE_TICKET_PRICE;
    }
    
    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
   
    
    public void insertMoney (Coin value)
    {
            
            
            balance = balance + value.getValue();
    }
       
      
    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("One Way "+issuedTicket);
            System.out.println("Ticket");
            System.out.println("Ticket Price " + price + " Pence.");
            System.out.println("Thanks for doing business with us");
            System.out.println("########");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
}