package academia.abs.factory.pizza.factory;

import academia.abs.factory.pizza.ingredientes.Cheese;
import academia.abs.factory.pizza.ingredientes.Clams;
import academia.abs.factory.pizza.ingredientes.Dough;
import academia.abs.factory.pizza.ingredientes.FreshClams;
import academia.abs.factory.pizza.ingredientes.Garlic;
import academia.abs.factory.pizza.ingredientes.MarinaraSauce;
import academia.abs.factory.pizza.ingredientes.Mushroom;
import academia.abs.factory.pizza.ingredientes.Onion;
import academia.abs.factory.pizza.ingredientes.Pepperoni;
import academia.abs.factory.pizza.ingredientes.RedPepper;
import academia.abs.factory.pizza.ingredientes.ReggianoCheese;
import academia.abs.factory.pizza.ingredientes.Sauce;
import academia.abs.factory.pizza.ingredientes.SlicedPepperoni;
import academia.abs.factory.pizza.ingredientes.ThinCrustDough;
import academia.abs.factory.pizza.ingredientes.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
