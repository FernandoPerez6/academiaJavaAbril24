package academia.abs.factory.pizza.factory;

import academia.abs.factory.pizza.ingredientes.BlackOlives;
import academia.abs.factory.pizza.ingredientes.Cheese;
import academia.abs.factory.pizza.ingredientes.Clams;
import academia.abs.factory.pizza.ingredientes.Dough;
import academia.abs.factory.pizza.ingredientes.Eggplant;
import academia.abs.factory.pizza.ingredientes.FrozenClams;
import academia.abs.factory.pizza.ingredientes.MozzarellaCheese;
import academia.abs.factory.pizza.ingredientes.Pepperoni;
import academia.abs.factory.pizza.ingredientes.PlumTomatoSauce;
import academia.abs.factory.pizza.ingredientes.Sauce;
import academia.abs.factory.pizza.ingredientes.SlicedPepperoni;
import academia.abs.factory.pizza.ingredientes.Spinach;
import academia.abs.factory.pizza.ingredientes.ThickCrustDough;
import academia.abs.factory.pizza.ingredientes.Veggies;

public class ChicagoPizzaIngredientFactory 
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), 
		                      new Spinach(), 
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
