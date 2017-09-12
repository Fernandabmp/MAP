package PizzaStore;

public class Main {

	public static void main(String[] args) {
		
		ChicagoPizzaStore pizzaria = new ChicagoPizzaStore();
		pizzaria.orderPizza("cheese");
		pizzaria.orderPizza("veggie");
		pizzaria.orderPizza("clam");
		pizzaria.orderPizza("pepperoni");

	}

}
