/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class Sundae extends IceCream{
    
    private String toppingName;
    private int toppingCost;
    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost){
       super(icName, icCost);
       // initialize variables
       this.toppingName = toppingName;
       this.toppingCost = toppingCost;
    }
    
    public String getTopName(){
        return this.toppingName;
    }
    
    public int getTopCost(){
        return this.toppingCost;
    }
    
    public int getSCost(){
        // calculate cost
        int SCost = this.toppingCost + super.getCost();
        return SCost;
    }

    @Override
    public String toString(){
        // put price into dollars and cents
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        // find the amount of space needed on receipt
        int numOSpaces = 30 - super.getName().length() - output.length();
        // use for loop to print out proper spacing
        for (int i = 0; i < numOSpaces; i++) {
            output = " " + output;  
        }
        // return what should be printed on the receipt
        return this.toppingName + " Sundae with \n" + super.getName() + output;
    }
    
}
