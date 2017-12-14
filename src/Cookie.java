/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class Cookie extends DessertItem{
    
    private int costPerDozen;
    private int number;
    
    public Cookie(String name, int number, int pricePer12){
        super(name);
        // initialize variables
        this.costPerDozen = costPerDozen;
        this.number = number;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    @Override
    public int getCost() {
        // calculate cost
        int cost = (this.costPerDozen * this.number)/12;
        return cost;
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
        return this.number + " @ $" + this.costPerDozen*0.01 + " /dozen \n" + super.getName() + output;
    }
}
