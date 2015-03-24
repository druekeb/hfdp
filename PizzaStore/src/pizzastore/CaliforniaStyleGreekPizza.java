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
class CaliforniaStyleGreekPizza extends Pizza {

    public CaliforniaStyleGreekPizza() {
    	name = "California Style Greek Pizza";
	dough = "Medium Thick  Dough";
	sauce = "Olive Tomato Sauce";
 
        toppings.add("Shredded Feta Cheese");
	toppings.add("Black Olives");
	toppings.add("Spinach");
	toppings.add("Eggplant");
	toppings.add("Sliced Pepperoni");
	}
 
	void cut() {
		System.out.println("Dont't cut the Pizza");
	}

}
