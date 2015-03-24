/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzastore;

/**
 *
 * @author barbara
 */
public  class CaliforniaStylePizzaStore extends PizzaStore {

      
    public  Pizza createPizza(String type){
        
        Pizza pizza = null;
        switch(type){
             case "cheese":
                pizza = new CaliforniaStyleCheesePizza();
                break;
            case "pepperoni":
                pizza = new CaliforniaStylePepperoniPizza();
                break;
            case "greek" :
                pizza = new CaliforniaStyleGreekPizza();
                break;
            case "clam":
                pizza = new CaliforniaStyleClamPizza();
                break;
            case "veggie": 
                pizza = new CaliforniaStyleVeggiePizza();
        }
        return pizza;
    }
    
}
