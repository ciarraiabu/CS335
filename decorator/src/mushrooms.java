
public class mushrooms extends PizzaDecorator{
	
	private final Pizza pizza;
	
	public mushrooms(Pizza pizza){
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc()+", mushrooms (1.59)";
	}


	@Override
	public double getPrice() {
		return pizza.getPrice()+1.59;
	}

}
