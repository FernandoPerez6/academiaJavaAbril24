package academia.abs.factory.pizza.store;

import academia.abs.factory.pizza.Pizza;

public abstract class PizzaStore {
 
	protected abstract Pizza createPizza(String item);
 
	final public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
