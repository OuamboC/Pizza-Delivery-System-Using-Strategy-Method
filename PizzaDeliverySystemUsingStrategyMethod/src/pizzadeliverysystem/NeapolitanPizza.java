package pizzadeliverysystem;

import java.util.List;

import dough.Dough;
import sauce.Sauce;
import topping.Toppings;

public class NeapolitanPizza extends Pizza {
	

	public NeapolitanPizza(Dough dough, List<Toppings> toppings, Sauce sauce ) {
		
		super(dough, toppings, sauce);
		
		
	}

	@Override 
	public String getName() {
		return dough + " crust, with " +  toppings+ " toppings and " + sauce + " sauce" ;
		
	}

	@Override
	public List<Toppings> getNameOfToppings() {
		// TODO Auto-generated method stub
		return toppings;
	}

}
