
public abstract class Beverage {
	String bevName;
	Type type;
	Size size;
	
	final double BASE_PRICE = 2.0;
	final double MEDIUM_PRICE =BASE_PRICE +1;
	final double LARGE_PRICE = MEDIUM_PRICE+1;
	
	public Beverage(String name, Type type, Size size)
	{
		bevName = name;
		this.type= type;
		this.size = size;
	}
	
	public abstract double calcPrice();	
	
	public String toString()
	{
		return this.bevName +"," + this.size;
	}
	
	//getters
	public double getBasePrice()
	{
		return BASE_PRICE;
	}
	
	public String getBevName()
	{
		return this.bevName;
	}
	
	public Size getSize()
	{
		return this.size;
	}
	
	public Type getType()
	{
		return this.type;
	}
	
	@Override
	public boolean equals (Object anotherBev)
	{
		Beverage temp = (Beverage) anotherBev;
		
		if (bevName.equalsIgnoreCase(temp.getBevName()) && this.type == temp.getType() && this.size == temp.getSize() )
		{
			return true;
		}
		return false;


	
	}
}
