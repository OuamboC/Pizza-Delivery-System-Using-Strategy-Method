package pizzadeliverysystem;

import java.util.List;

import dough.Dough;
import sauce.Sauce;
import topping.Toppings;

public interface PizzaMaker {
	public abstract void makePizza(Dough dough , List<Toppings> toppings , Sauce sauce);
	

}
