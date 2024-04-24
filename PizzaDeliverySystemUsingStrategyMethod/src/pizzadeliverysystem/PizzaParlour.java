package pizzadeliverysystem;

import java.util.ArrayList;
import java.util.List;

import dough.Dough;
import dough.Neapolitan;
import dough.TchickCrust;
import dough.ThinCrust;
import sauce.AlfredoSauce;
import sauce.BbqSauce;
import sauce.MarinaraSauce;
import sauce.Sauce;
import topping.Cheese;
import topping.Mushrooms;
import topping.Olives;
import topping.Onions;
import topping.Pepperoni;
import topping.Peppers;
import topping.Toppings;

public class PizzaParlour {

	public static void main(String[] args) {
		
		PizzaMaker pizzaOrder = new PizzaOrder();


		
		Dough neapolitanDough = new Neapolitan();
		List<Toppings> neapolitanTopping = new ArrayList<>();
		neapolitanTopping.add( new Cheese());
		neapolitanTopping.add(new Mushrooms());
		Sauce neapolitanSauce = new MarinaraSauce();
		
		pizzaOrder.makePizza(neapolitanDough, neapolitanTopping, neapolitanSauce);
		
		
		System.out.println(" \n ------------\n");
		
				Dough newyorkDough = new TchickCrust();
				List<Toppings> newyorkTopping = new ArrayList<>();
				newyorkTopping.add( new Olives());
				newyorkTopping.add(new Onions());
				newyorkTopping.add(new Pepperoni());
				newyorkTopping.add(new Peppers());
				Sauce newyorkSauce = new BbqSauce();
				
				pizzaOrder.makePizza(newyorkDough, newyorkTopping, newyorkSauce);
				
				System.out.println(" \n ------------\n");
				
						Dough sicilianDough = new ThinCrust();
						List<Toppings> sicilianTopping = new ArrayList<>();
						sicilianTopping.add( new Olives());
						sicilianTopping.add(new Onions());
						sicilianTopping.add(new Pepperoni());
						sicilianTopping.add(new Peppers());
						Sauce sicilianSauce = new AlfredoSauce();
						
						pizzaOrder.makePizza(sicilianDough, sicilianTopping, sicilianSauce);
		
		
		
		System.out.println("\n------------\n");
		System.out.println("Thank you  for ordering and hope to see you soon.");
		

		
		
		
		

		    
		    
		    
		    
		   

		   
		}

		
		
}
