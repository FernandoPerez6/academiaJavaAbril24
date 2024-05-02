package academia.abs.factory.pizza.store;

import academia.abs.factory.pizza.CheesePizza;
import academia.abs.factory.pizza.ClamPizza;
import academia.abs.factory.pizza.PepperoniPizza;
import academia.abs.factory.pizza.Pizza;
import academia.abs.factory.pizza.VeggiePizza;
import academia.abs.factory.pizza.factory.OaxPizzaIngredientFactory;
import academia.abs.factory.pizza.factory.PizzaIngredientFactory;

public class OaxacaPizzaStore extends PizzaStore {
 
	@Override
	protected Pizza createPizza(String item) {
		
		Pizza pizza = null;
		
		PizzaIngredientFactory ingredientFactory = 
			new OaxPizzaIngredientFactory();
 
		if (item.equals("cheese")) {
  
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Oaxaca Style Cheese Pizza");
  
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Oaxaca Style Veggie Pizza");
 
		} else if (item.equals("clam")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Oaxaca Style Clam Pizza");
 
		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Oaxaca Style Pepperoni Pizza");
 
		} 
		return pizza;
	}
}
