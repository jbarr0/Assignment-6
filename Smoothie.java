
public class Smoothie extends Beverage{
	
	int numOfFruits;
	final double costPerFruit =.5;
	boolean addProtien;
	final double costToAddProtien =1.50;
	
	public Smoothie (String bevName, Size size, int numOfFruits, boolean addProtien )
	{
		super(bevName,Type.SMOOTHIE,size);
		this.numOfFruits = numOfFruits;
		this.addProtien = addProtien;
	}
	
	@Override
	public String toString()
	{
		return this.bevName +","+this.size+","+ this.addProtien +"," +this.numOfFruits +","+ calcPrice();
	}
	@Override
	public boolean equals(Object anotherBev)
	{
		Smoothie temp = (Smoothie) anotherBev;
		
		if (super.equals(temp) && this.numOfFruits == temp.getNumOfFruits() && this.addProtien == temp.getAddProtien())
		{
			return true;
		}
		
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
		
		if (this.addProtien)
			price+=costToAddProtien;
			
		if ( this.numOfFruits >0)
		{
			for ( int i =0; i<numOfFruits; i++)
			{
				price+=costPerFruit;
			}
		}

			return price;
	}
	
	
	public int getNumOfFruits()
	{
		return this.numOfFruits;
	}
	
	public boolean getAddProtien()
	{
		return this.addProtien;
	}
}


	

