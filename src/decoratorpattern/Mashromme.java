package decoratorPattern;

public class Mashromme extends ToppingDecorator{
	Pizza pizza;
	
	public Mashromme(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + " ,With Mashromme";
	}

	@Override
	public double cost() {
		return 0.1 + pizza.cost();
	}

}
