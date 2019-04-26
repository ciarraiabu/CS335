import java.text.DecimalFormat;
public final class NapoliPizza extends MealDeals
{
	private Pizza pizza;
	DecimalFormat dformat = new DecimalFormat("#.##");
	
	public NapoliPizza()
	{
		buildPizza();
	}
	
	private void buildPizza()
	{
		pizza = new SimplyVegPizza();
		pizza= new RedOnions (pizza);
		pizza= new Spinach (pizza);
		pizza= new Broccoli (pizza);
		pizza= new GreenOlives (pizza);
		
		System.out.println("Desc: "+pizza.getDesc());
		System.out.println("Price: "+dformat.format(pizza.getPrice()*0.8));
	}
	
	@Override
	public final Pizza getPizza()
	{
		return pizza;
	}
	
	
	
	
}
