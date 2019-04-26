
public class peppers extends PizzaDecorator{

private final Pizza pizza;
	
	public peppers(Pizza pizza){
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc()+", peppers (1.79)";
	}


	@Override
	public double getPrice() {
		return pizza.getPrice()+1.79;
	}
}
