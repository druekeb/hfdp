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
public class DeCaf extends Beverage {
    
    public DeCaf(SizeEnum size){
        this.setSize(size);
        setDescription(SizeEnum.BIG,"Large DeCaf");
        setDescription(SizeEnum.TALL,"Tall DeCaf");
        setDescription(SizeEnum.VENTI,"Small DeCaf");
        setPrice(SizeEnum.VENTI,0.9);
        setPrice(SizeEnum.BIG,1.0);
        setPrice(SizeEnum.TALL,1.1); 
    }
   
}