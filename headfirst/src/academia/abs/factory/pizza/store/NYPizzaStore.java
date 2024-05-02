package academia.abs.factory.pizza.store;

import academia.abs.factory.pizza.CheesePizza;
import academia.abs.factory.pizza.ClamPizza;
import academia.abs.factory.pizza.PepperoniPizza;
import academia.abs.factory.pizza.Pizza;
import academia.abs.factory.pizza.VeggiePizza;
import academia.abs.factory.pizza.factory.NYPizzaIngredientFactory;
import academia.abs.factory.pizza.factory.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {
 
	@Override
	protected Pizza createPizza(String item) {
		
		Pizza pizza = null;
		
		PizzaIngredientFactory ingredientFactory = 
			new NYPizzaIngredientFactory();
 
		if (item.equals("cheese")) {
  
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
  
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
 
		} else if (item.equals("clam")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
 
		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
 
		} 
		return pizza;
	}
}
