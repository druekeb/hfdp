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
public class TestPizzaStore {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PizzaStore nyStore = new NYStylePizzaStore();
	PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        PizzaStore californiaStore = new CaliforniaStylePizzaStore();
        
	Pizza pizza = nyStore.order("cheese");
	System.out.println("Ethan ordered a " + pizza.getName() + "\n");

	pizza = chicagoStore.order("cheese");
	System.out.println("Joel ordered a " + pizza.getName() + "\n");
        
        pizza = californiaStore.order("cheese");
	System.out.println("Mary ordered a " + pizza.getName() + "\n");

        pizza = nyStore.order("clam");
	System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
	pizza = chicagoStore.order("clam");
	System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = californiaStore.order("clam");
	System.out.println("Mary ordered a " + pizza.getName() + "\n");

	pizza = nyStore.order("pepperoni");
	System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
	pizza = chicagoStore.order("pepperoni");
	System.out.println("Joel ordered a " + pizza.getName() + "\n");

	pizza = californiaStore.order("pepperoni");
	System.out.println("Mary ordered a " + pizza.getName() + "\n");

        pizza = nyStore.order("veggie");
	System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
	pizza = chicagoStore.order("veggie");
	System.out.println("Joel ordered a " + pizza.getName() + "\n");

       	pizza = californiaStore.order("veggie");
	System.out.println("Mary ordered a " + pizza.getName() + "\n");

        pizza = nyStore.order("greek");
	System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
	pizza = chicagoStore.order("greek");
	System.out.println("Joel ordered a " + pizza.getName() + "\n");
        
        pizza = californiaStore.order("greek");
	System.out.println("Mary ordered a " + pizza.getName() + "\n");
 
    }   
    
}
