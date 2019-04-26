
public class pineapples extends PizzaDecorator{
  
private final Pizza pizza;
	
	public pineapples(Pizza pizza){
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc()+", pineapples (2.83)";
	}


	@Override
	public double getPrice() {
		return pizza.getPrice()+2.83;
	}
}
