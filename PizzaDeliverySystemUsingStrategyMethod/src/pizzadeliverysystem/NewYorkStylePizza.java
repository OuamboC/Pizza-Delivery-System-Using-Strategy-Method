package pizzadeliverysystem;

import java.util.List;

import dough.Dough;
import sauce.Sauce;
import topping.Toppings;

public class NewYorkStylePizza extends Pizza {
	
		
	public NewYorkStylePizza(Dough dough, List<Toppings> toppings, Sauce sauce) {
		super(dough, toppings, sauce);
		
	}

	

	@Override
	public String getName() {
		return "NewYorkStyle pizza with " + toppings + "toppings and " + sauce + "sauce";
	}

	@Override
	public List<Toppings> getNameOfToppings() {
		
		return toppings;
	}

}
