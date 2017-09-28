package builder;

public class ChicagoStyleVeggiePizza extends PizzaBuilder {

	@Override
	public void buildName() {
		pizza.name = "Chicago Deep Dish Veggie Pizza";

	}

	@Override
	public void buildDough() {
		pizza.dough = "Extra Thick Crust Dough";

	}

	@Override
	public void buildSauce() {
		pizza.sauce = "Plum Tomato Sauce";

	}

	@Override
	public void buildPrepare() {
		pizza.prepare();

	}

	@Override
	public void buildBake() {
		pizza.bake();

	}

	@Override
	public void buildCut() {
		System.out.println("Cutting the pizza into square slices");

	}

	@Override
	public void buildBox() {
		pizza.box();

	}

	@Override
	public void buidToppings() {
		pizza.toppings.add("Shredded Mozzarella Cheese");
		pizza.toppings.add("Black Olives");
		pizza.toppings.add("Spinach");
		pizza.toppings.add("Eggplant");

	}

}
