package academia.abs.factory.pizza.factory;

import academia.abs.factory.pizza.ingredientes.Cheese;
import academia.abs.factory.pizza.ingredientes.Clams;
import academia.abs.factory.pizza.ingredientes.Dough;
import academia.abs.factory.pizza.ingredientes.Pepperoni;
import academia.abs.factory.pizza.ingredientes.Sauce;
import academia.abs.factory.pizza.ingredientes.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
