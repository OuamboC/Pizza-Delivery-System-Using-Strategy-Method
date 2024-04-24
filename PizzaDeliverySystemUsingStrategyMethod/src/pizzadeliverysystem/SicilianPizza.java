package pizzadeliverysystem;

import java.util.List;

import dough.Dough;
import sauce.Sauce;
import topping.Toppings;

public class SicilianPizza extends Pizza{
	public SicilianPizza(Dough dough, List<Toppings> toppings, Sauce sauce) {
		super(dough, toppings, sauce);
	}
	
	@Override 
	public String getName() {
		return "Sicilian pizza with " + toppings + " toppings and " + sauce + "sauce";
	}

	@Override
	public List<Toppings> getNameOfToppings() {
		
		return toppings;
	}


}
