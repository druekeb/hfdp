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
public  class ChicagoStylePizzaStore extends PizzaStore {

    public ChicagoStylePizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }
    
    
      
    public  Pizza createPizza(String type){
        
        Pizza pizza = null;
        switch(type){
             case "cheese":
                pizza = new ChicagoStyleCheesePizza();
                break;
            case "pepperoni":
                pizza = new ChicagoStylePepperoniPizza();
                break;
            case "greek" :
                pizza = new ChicagoStyleGreekPizza();
                break;
            case "clam":
                pizza = new ChicagoStyleClamPizza();
                break;
            case "veggie": 
                pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
    
}
