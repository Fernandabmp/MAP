package PizzaStore;

import java.util.ArrayList;

public interface Pizza {
	
	ArrayList<String> toppings = new ArrayList<String>();

	void prepare();

	void bake();

	void cut();

	void box();

	String getName();

	String toString();

}
