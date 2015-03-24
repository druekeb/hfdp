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
public class CaliforniaStyleClamPizza extends Pizza {
	public CaliforniaStyleClamPizza() {
		name = "California Style Clam Pizza";
		dough = "Medium Thick Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Buffalo Mozzarella Cheese");
		toppings.add("Frozen Clams from Monterey Bay");
	}
 
	void cut() {
		System.out.println("Don't cut the pizza!");
	}
}
