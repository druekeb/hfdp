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
public class Whip extends CondimentDecorator {

    public Whip(Beverage bev) {
        this.beverage=bev;
        setSize(bev.getSize());
        setPrice(SizeEnum.VENTI,0.1);
        setPrice(SizeEnum.BIG,0.2);
        setPrice(SizeEnum.TALL,0.3); 
        setCondDesc("Whipped Milk");
    }
        
   
}
