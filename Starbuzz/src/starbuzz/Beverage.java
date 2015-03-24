/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzz;


import java.util.HashMap;

/**
 *
 * @author barbara
 */
public abstract class Beverage {
    
    private HashMap <SizeEnum, String> descriptions = new HashMap<>();
    private HashMap <SizeEnum, Double> prices = new HashMap<>();
    private SizeEnum size;
    

    
    public void setSize(SizeEnum size) {
        this.size = size;
    }

    public SizeEnum getSize() {
        return size;
    }
    
    public  Double cost(){
        return getPrice(this.getSize()) ;
    }
    
     public String getDescription(SizeEnum size) {
        return this.descriptions.get(size);
    }
     public void setDescription(SizeEnum size, String desc) {
        this.descriptions.put(size, desc);
    }
     
     public Double getPrice(SizeEnum size) {
        return this.prices.get(size);
    }
     public void setPrice(SizeEnum size, Double pri) {
        this.prices.put(size, pri);
     }
    
}
