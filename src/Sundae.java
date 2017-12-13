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
        return ;
    }
    
}
