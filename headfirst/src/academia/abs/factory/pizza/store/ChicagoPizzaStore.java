package academia.abs.factory.pizza.store;

import academia.abs.factory.pizza.CheesePizza;
import academia.abs.factory.pizza.ClamPizza;
import academia.abs.factory.pizza.PepperoniPizza;
import academia.abs.factory.pizza.Pizza;
import academia.abs.factory.pizza.VeggiePizza;
import academia.abs.factory.pizza.factory.ChicagoPizzaIngredientFactory;
import academia.abs.factory.pizza.factory.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");

		}
		return pizza;
	}
}
