
public class Alcohol extends Beverage{
	boolean isWeekend;
	final double costForIsWeekend =0.60;
	
	Alcohol(String bevName, Size size, boolean isWeekend)
	{
		super(bevName, Type.ALCOHOL,size);
		this.isWeekend = isWeekend;
	}
	
	@Override
	public String toString()
	{
		return this.bevName +"," + this.size  +"," + this.isWeekend +","+ calcPrice();
	}
	
	@Override
	public boolean equals(Object o)
	{
		Alcohol temp = (Alcohol) o;
		
		if (super.equals(temp) && this.isWeekend == temp.isWeekend)
				return true;
		
		return false;
	}
	
	@Override
	public double calcPrice()
	{
		double price =0.0;

		if(this.size == size.LARGE)
			price+= LARGE_PRICE;
		else if (this.size == Size.MEDIUM)
			price+= MEDIUM_PRICE;
		else
			price+= BASE_PRICE;
		
		if(this.isWeekend)
			price+=costForIsWeekend;
		
		return price;
	}
	public boolean getIsWeekend()
	{
		return this.isWeekend;
	}
	
}
