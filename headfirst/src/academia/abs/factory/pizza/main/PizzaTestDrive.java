package academia.abs.factory.pizza.main;

import academia.abs.factory.pizza.Pizza;
import academia.abs.factory.pizza.store.ChicagoPizzaStore;
import academia.abs.factory.pizza.store.NYPizzaStore;
import academia.abs.factory.pizza.store.OaxacaPizzaStore;
import academia.abs.factory.pizza.store.PizzaStore;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		
		//CREAN LAS TIENDAS
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		PizzaStore oaxacaStore = new OaxacaPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza + "\n");
		
		pizza = oaxacaStore.orderPizza("cheese");
		System.out.println("Patrobas ordered a " + pizza + "\n");

		
//
//		pizza = nyStore.orderPizza("clam");
//		System.out.println("Ethan ordered a " + pizza + "\n");
// 
//		pizza = chicagoStore.orderPizza("clam");
//		System.out.println("Joel ordered a " + pizza + "\n");
//
//		pizza = nyStore.orderPizza("pepperoni");
//		System.out.println("Ethan ordered a " + pizza + "\n");
// 
//		pizza = chicagoStore.orderPizza("pepperoni");
//		System.out.println("Joel ordered a " + pizza + "\n");
//
//		pizza = nyStore.orderPizza("veggie");
//		System.out.println("Ethan ordered a " + pizza + "\n");
// 
//		pizza = chicagoStore.orderPizza("veggie");
//		System.out.println("Joel ordered a " + pizza + "\n");
	}
}
