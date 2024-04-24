package pizzadeliverysystem;

import java.util.List;

import dough.Dough;
import sauce.Sauce;
import topping.Toppings;

public abstract class Pizza {
	protected List<Toppings> toppings ;
	protected Sauce sauce;
	protected Dough dough;
	
	
	public Pizza(Dough dough, List<Toppings> toppings, Sauce sauce) {
		this.toppings = toppings;
		this.sauce = sauce;
		this.dough = dough;
		
	}
	
	public abstract String getName();
	public abstract List<Toppings> getNameOfToppings();
	

}
