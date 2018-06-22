/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theaterrevenue;

/**
 *
 * @author Tamu Fahnbulleh
 */
public class Tickets
{
    private final Revenue mRevenue;
    
    /**
     
     * constructor
     * @param price
     * @param numberOfTickets
     */
    public Tickets(double price, int numberOfTickets)
    {
        mRevenue=new Revenue(price,numberOfTickets);
    }
    
    /**
     Revenue object
     * @return
     */
    public Revenue getRevenue()
    {
        return mRevenue;
    }
    
    /**
     
     return(double) ticket price 
     * @return
     */
    public double getTicketPrice() 
    {
       return mRevenue.getPrice();
    }

    /**
     *
     return(int) the number of ticket sold
     * @return
     */
    public int getNumberOfTicketSold() 
    {
       return mRevenue.getNumberOfTickets();
    }  
}
