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
        SimplePizzaFactory spf = new SimplePizzaFactory();
        PizzaStore ps = new NYStylePizzaStore(spf);
        Pizza pizza = ps.order("cheese");
        System.out.println("Factory: "+spf.toString());
        System.out.println("Store: "+ps.toString());
        System.out.println("Pizza: "+pizza);
        
        
        PizzaStore ps1 = new ChicagoStylePizzaStore(spf);
        Pizza pizza1 = ps1.order("greek");
        System.out.println("Factory: "+spf.toString());
        System.out.println("Store: "+ps1.toString());
        System.out.println("Pizza: "+pizza1);
        
       
        
    }
    
}
