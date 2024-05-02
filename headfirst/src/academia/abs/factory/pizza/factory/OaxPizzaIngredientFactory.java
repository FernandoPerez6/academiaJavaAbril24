package academia.abs.factory.pizza.factory;

import academia.abs.factory.pizza.ingredientes.Aguacate;
import academia.abs.factory.pizza.ingredientes.ChapulinesSauce;
import academia.abs.factory.pizza.ingredientes.Cheese;
import academia.abs.factory.pizza.ingredientes.Clams;
import academia.abs.factory.pizza.ingredientes.Dough;
import academia.abs.factory.pizza.ingredientes.FreshClams;
import academia.abs.factory.pizza.ingredientes.Frijol;
import academia.abs.factory.pizza.ingredientes.MasaMaizAzul;
import academia.abs.factory.pizza.ingredientes.OaxacaCheese;
import academia.abs.factory.pizza.ingredientes.Onion;
import academia.abs.factory.pizza.ingredientes.Pepperoni;
import academia.abs.factory.pizza.ingredientes.Sauce;
import academia.abs.factory.pizza.ingredientes.SlicedPepperoni;
import academia.abs.factory.pizza.ingredientes.ThinCrustDough;
import academia.abs.factory.pizza.ingredientes.Veggies;

public class OaxPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new MasaMaizAzul();
	}
 
	public Sauce createSauce() {
		return new ChapulinesSauce();
	}
 
	public Cheese createCheese() {
		return new OaxacaCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Aguacate(), new Frijol(), new Onion() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
