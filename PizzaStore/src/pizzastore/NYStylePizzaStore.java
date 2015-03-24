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
public  class NYStylePizzaStore extends PizzaStore{
    

    public NYStylePizzaStore() {
    }

   
    @Override
   public Pizza createPizza(String type){
        Pizza pizza = null;
        switch(type){
            case "cheese":
                pizza = new NYStyleCheesePizza();
                break;
            case "pepperoni":
                pizza = new NYStylePepperoniPizza();
                break;
            case "greek" :
                pizza = new NYStyleGreekPizza();
                break;
            case "clam":
                pizza = new NYStyleClamPizza();
                break;
            case "veggie": 
                pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }  

   
   }
