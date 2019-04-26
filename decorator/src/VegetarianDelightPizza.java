import java.text.DecimalFormat;
public final class VegetarianDelightPizza extends MealDeals
{
	private Pizza pizza;
	DecimalFormat dformat = new DecimalFormat("#.##");
	
	public VegetarianDelightPizza()
	{
		buildPizza();
	}
	
	private void buildPizza()
	{
		pizza = new SimplyVegPizza();
		pizza= new Spinach (pizza);
		pizza= new RedOnions (pizza);
		pizza= new GreenOlives (pizza);
		pizza= new Broccoli (pizza);
		
		System.out.println("Desc: "+pizza.getDesc());
		System.out.println("Price: "+dformat.format(pizza.getPrice()*0.8));
	}
	
	@Override
	public final Pizza getPizza()
	{
		return pizza;
	}
	
	
}
