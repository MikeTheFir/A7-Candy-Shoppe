/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class IceCream extends DessertItem{

    private int cost;
    
    public IceCream(String name, int cost){
        super(name);
        // initialize variable
        this.cost = cost;
    }
    
    @Override
    public int getCost() {
        return this.cost;
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
        return super.getName() + output;
    }
}
