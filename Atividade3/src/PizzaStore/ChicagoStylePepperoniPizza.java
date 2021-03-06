package PizzaStore;

public class ChicagoStylePepperoniPizza implements Pizza {

	String name;
	String dough;
	String sauce;

	public ChicagoStylePepperoniPizza() {
		this.name = "Chicago Style Pepperoni Pizza";
		this.dough = "Extra Thick Crust Dough";
		this.sauce = "Plum Tomato Sauce";

		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
		toppings.add("Sliced Pepperoni");
	}

	public void prepare() {
		System.out.println("Prepare " + this.name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (String topping : toppings) {
			System.out.println("   " + topping);
		}
	}

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return this.name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + this.name + " ----\n");
		display.append(this.dough + "\n");
		display.append(this.sauce + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}

}
