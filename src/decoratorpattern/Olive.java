package decoratorPattern;

public class Olive extends ToppingDecorator{
	Pizza pizza;
	
	public Olive(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + " ,Olive";
	}

	@Override
	public double cost() {
		return 0.30 + pizza.cost();
	}

}
