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
public class Espresso extends Beverage {
    
    public Espresso(SizeEnum size){
        this.setSize(size);
        setDescription(SizeEnum.BIG,"Large Espresso");
        setDescription(SizeEnum.TALL,"Tall Espresso");
        setDescription(SizeEnum.VENTI,"Small Espresso");
        setPrice(SizeEnum.VENTI,1.0);
        setPrice(SizeEnum.BIG,1.1);
        setPrice(SizeEnum.TALL,1.2); 
    }
}
