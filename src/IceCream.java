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
        return ;
    }
}
