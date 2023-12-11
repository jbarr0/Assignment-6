
public class Coffee extends Beverage {

	boolean extraShot;
	final double extraShotCost = .5;
	boolean extraSyrup;
	final double extraSyrupCost = .5;

	Coffee ( String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		super(bevName,Type.COFFEE,size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}
	@Override
	public boolean equals(Object anotherCoffee)
	{
		Coffee temp = (Coffee)anotherCoffee;
		if (super.equals(temp) && this.extraShot == temp.getExtraShot() && this.extraSyrup == temp.getExtraSyrup())
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
		
		if (this.extraShot)
			price+= extraShotCost;
		if (this.extraSyrup)
			price+=extraSyrupCost;
		
		return price;
		
		
	}
	
	public String toString()
	{
		return this.bevName +","+this.size+","+ this.extraShot +"," +this.extraSyrup +","+ calcPrice();
		
	}
	public boolean getExtraShot()
	{
		return this.extraShot;
	}
	
	public boolean getExtraSyrup()
	{
		return this.extraSyrup;
	}
}
