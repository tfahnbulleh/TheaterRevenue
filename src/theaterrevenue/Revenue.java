/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theaterrevenue;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Tamu Fahnbulleh
 */
public class Revenue 
{
    //instance variables
    private double GrossRevenue; //store gross revenue
    private double NetRevenue; //store net revenue
    protected final double Price; //store price
    protected final int NumberOfTickets; //number of tickets sold
    private final double PERCENT; //commision percent
 
    //constructor
    public Revenue(double price,int numberOfTickets)
    {    
        this.PERCENT = 0.2;
        this.Price=price;
        this.NumberOfTickets=numberOfTickets;
        this.grossRevenue(); //method call
        this.netRevenue();  //method call  
    }
    
    /**
     return the Price (double)
     * @return
     */
    public double getPrice() 
    {
        return Price;
    }

    /**
     return the number of tickets (int)
     * @return
     */
    public int getNumberOfTickets() 
    {
        return NumberOfTickets;
    }
    
    public double getGrossRevenue() 
    {
       return this.GrossRevenue;
    }

    /**
      return net revenue (double)
     * @return
     */
    public double getNetRevenue() 
    {
        return this.NetRevenue;
    }

   /**
      calculate gross revenue 
     * @return
     */
    private  void grossRevenue()
    {
        BigDecimal revenue=new BigDecimal(this.NumberOfTickets*this.Price);
        revenue=revenue.setScale(2,RoundingMode.HALF_EVEN);
        this.GrossRevenue=revenue.doubleValue();
    }

    /**
     calculate net revenue
     * @return
     */
    private  void netRevenue()
    {
    //create BigDecimal object and pass the product of NumberOfTictecks and Ticket price to the object constructor
         BigDecimal revenue=new BigDecimal(this.PERCENT*this.NumberOfTickets*this.Price);
        
         //round the value of revenue to  two decimal places
         revenue=revenue.setScale(2,RoundingMode.HALF_EVEN);
         
         //return double value of revenue
         this.NetRevenue=revenue.doubleValue();
    }
    
}
