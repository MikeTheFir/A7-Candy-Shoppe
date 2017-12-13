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
    private int costPerPound;
    
    public Candy(String name, double weight, int pricePerLbs){
        super(name);
        // initialize variables
        this.weight = weight;
        this.costPerPound = costPerPound;
    }
    
    public double getWeight(){
        return this.weight;
    }
    
    public int getCPP(){
        return this.costPerPound;
    }
    
    @Override
    public int getCost(){
        // calculate cost
        double cost = this.weight * this.costPerPound;
        // round the cost
        double round = Math.round(cost);
        return (int) round;
    }
    
    @Override
    public String toString(){
       return ;
    }
}
