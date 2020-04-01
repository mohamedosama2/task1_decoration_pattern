package decoratorPattern;

public class Restaurant {

	public static void main(String[] args) {
		Pizza pizza = new Chicken();
		//System.out.println(pizza.getDescription()
		//		+ " $" +pizza.cost());
		
	
                //Pizza pizzas =new Tuna();
                pizza=new Tomato(pizza);
                pizza=new Pepper(pizza);
                pizza=new Pepper(pizza);
                pizza=new Olive(pizza);
                pizza=new Mashromme(pizza);



                
                
                
                System.out.println(pizza.getDescription()
				+ " $" + pizza.cost());
	}

}
