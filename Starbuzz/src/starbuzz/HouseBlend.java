/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzz;

/**
 *
 * @author barbara
 */
public class HouseBlend extends Beverage {
    
    
    public HouseBlend(SizeEnum size){
        this.setSize(size);
        setDescription(SizeEnum.BIG,"Large HouseBlend");
        setDescription(SizeEnum.TALL,"Tall HouseBlend");
        setDescription(SizeEnum.VENTI,"Small HouseBlend");
        setPrice(SizeEnum.VENTI,0.9);
        setPrice(SizeEnum.BIG,1.0);
        setPrice(SizeEnum.TALL,1.1); 
    }
}