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
class ChicagoStyleGreekPizza extends Pizza {

    public ChicagoStyleGreekPizza() {
    	name = "Chicago Style Greek Pizza";
	dough = "Extra Thick Crust Dough";
	sauce = "Olive Tomato Sauce";
 
        toppings.add("Shredded Feta Cheese");
	toppings.add("Black Olives");
	toppings.add("Spinach");
	toppings.add("Eggplant");
	toppings.add("Sliced Pepperoni");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

}
