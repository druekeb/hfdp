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
public class CaliforniaStylePepperoniPizza extends Pizza {
	public CaliforniaStylePepperoniPizza() {
		name = "California Style Pepperoni Pizza";
		dough = "Medium Thick Dough";
		sauce = "Plum Berry Sauce";
 
		toppings.add("Buffalo Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
		toppings.add("Sliced Pepperoni");
	}
 
	void cut() {
		System.out.println("Don't cut the pizza into slices!");
	}
}

