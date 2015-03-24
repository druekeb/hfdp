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
public class DarkRoast extends Beverage {

    public DarkRoast(SizeEnum size) {
        this.setSize(size);
    
        setDescription(SizeEnum.BIG,"Large Dark Roasted Coffee");
        setDescription(SizeEnum.TALL,"Tall Dark Roasted Coffee");
        setDescription(SizeEnum.VENTI,"Small Dark Roasted Coffee");
        setPrice(SizeEnum.VENTI,0.8);
        setPrice(SizeEnum.BIG,0.9);
        setPrice(SizeEnum.TALL,1.0);
        
    }
     
}
