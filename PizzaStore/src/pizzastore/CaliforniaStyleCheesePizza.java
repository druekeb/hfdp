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
class CaliforniaStyleCheesePizza extends Pizza {

    public CaliforniaStyleCheesePizza() {
        name = "California Style Goat Cheese Pizza";
	dough = "Medium Thick Dough";
	sauce = "Plum Berry Sauce";
 
	toppings.add("Buffalo Mozzarella Cheese");
    }
 
	void cut() {
		System.out.println("Don't cut the pizza!");
	}
    
}
