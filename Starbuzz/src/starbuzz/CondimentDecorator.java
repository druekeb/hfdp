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
public abstract class CondimentDecorator extends Beverage{
    protected Beverage beverage;
    private String condDesc;

    
    public void setCondDesc(String condDesc) {
        this.condDesc = condDesc;
    }
    public String getCondDesc() {
        return condDesc;
    }

    @Override
    public String getDescription(SizeEnum size){
        return beverage.getDescription(size) +" + "+ this.getCondDesc();
    }
    
    public Double cost(){
        return beverage.cost() + this.getPrice(this.getSize());
    }
        
}
