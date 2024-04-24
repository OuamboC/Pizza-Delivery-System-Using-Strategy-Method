package pizzadeliverysystem;

import java.util.List;


import dough.Dough;

import sauce.Sauce;
import topping.Toppings;

public class PizzaOrder implements PizzaMaker { 

	
	
	@Override 
	public  void makePizza(Dough dough  , List<Toppings> toppings , Sauce sauce) {
		
		System.out.println("Order received for "+ dough.getDough() + " with " + sauce.getSauce() );
		System.out.println("Toppings:");
		for (Toppings t:toppings) {
			System.out.println(t.getTopping());
	}
	}
}
		
	
	
	

	



