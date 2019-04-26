import java.text.DecimalFormat;
public final class TexasGrillPizza extends MealDeals
{
	private Pizza pizza;
	DecimalFormat dformat = new DecimalFormat("#.##");
	
	public TexasGrillPizza()
	{
		buildPizza();
	}
	
	private void buildPizza()
	{
		pizza = new SimplyNonVegPizza();
		pizza= new FetaCheese (pizza);
		pizza= new Spinach (pizza);
		pizza= new RomaTomatoes (pizza);
		pizza= new GreenOlives (pizza);
		
		System.out.println("Desc: "+pizza.getDesc());
		System.out.println("Price: "+dformat.format(pizza.getPrice()));
	}
	
	@Override
	public final Pizza getPizza()
	{
		return pizza;
	}
	
	
}
