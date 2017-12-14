/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class Candy extends DessertItem{
    
    private double weight;
    private int pricePerLbs;
    
    public Candy(String name, double weight, int pricePerLbs){
        super(name);
        // initialize variables
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }
    
    public double getWeight(){
        return this.weight;
    }
    
    public int getCPP(){
        return this.pricePerLbs;
    }
    
    @Override
    public int getCost(){
        // calculate cost and round it
        double cost = Math.round(this.weight * this.pricePerLbs);
        return (int) cost;
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
        return this.weight + " lbs. @ $" + this.pricePerLbs*0.01 + " /lb \n" + super.getName() + output;
    }
}
