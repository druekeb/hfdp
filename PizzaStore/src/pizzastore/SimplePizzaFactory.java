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
class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        switch(type){
            case "cheese":
                pizza = new CheesePizza();
                break;
            
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
                
            case "greek" :
                pizza = new GreekPizza();
                break;
        }
        return pizza;
    }
}
