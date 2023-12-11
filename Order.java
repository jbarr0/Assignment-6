import java.util.ArrayList;
import java.util.Random;

public class Order implements OrderInterface, Comparable {
	
	private int orderNo;
	private int orderTime;
	private Day orderDay;
	private Customer customer;
	ArrayList<Beverage> beverages = new ArrayList<Beverage>();
	
	public int generateOrder()
	{
		Random random = new Random();
		return random.nextInt(10000, 90000);
	}
	
	public Order (int orderTime, Day orderDay,Customer cust)
	{
		this.orderNo= generateOrder();
		this.orderTime =orderTime;
		this.orderDay = orderDay;
		customer = new Customer(cust);	
	}
	// adds alcohol to order
	public void addNewBeverage (String bevName, Size size)
	{
		this.beverages.add(new Alcohol (bevName,size,isWeekend()));	
	}
	// adds Coffee to order
	public void addNewBeverage (String bevName, Size size, boolean extraShot,boolean extraSyrup)
	{
		this.beverages.add(new Coffee(bevName,size,extraShot,extraSyrup));
	}
	//adds smoothie to order
	public void addNewBeverage (String bevName, Size size, int numOfFruits, boolean addProtien)
	{
		this.beverages.add(new Smoothie (bevName,size,numOfFruits,addProtien));
	}
	
	public boolean isWeekend()
	{
		if (orderDay == Day.SATURDAY || orderDay == Day.SUNDAY)
			return true;
		return false;
	}
	
	public Beverage getBeverage(int itemNo)
	{
		return this.beverages.get(itemNo);
	}
	
	public double calcOrderTotal()
	{
		double sum =0.0;
		
		for (int i =0;i<this.beverages.size();i++)
		{
			sum+= this.beverages.get(i).calcPrice();
		}
		
		return sum;
	}
	public int findNumOfBeveType(Type type)
	{
		int count =0;
		for (Beverage b : beverages)
		{
			if (b.getType() == type)
				count++;
		}
		return count;
	}
	

	@Override
	public int compareTo(Object o) {
			
		Order temp = (Order)o;
		if (this.orderNo == temp.orderNo)
			return 0;
		else if (this.orderNo > temp.orderNo)
			return 1;
		else
			return -1;
	}
	
	@Override
	public String toString()
	{
		String rString = "" + this.orderNo +","+ this.orderTime  +","+  this.orderDay  +"," + customer.getName() +"," + customer.getAge() + "\n";
		for (int i =0; i<this.beverages.size();i++)
		{
			rString += this.beverages.get(i).toString()+"\n";
		}
		return rString;
	}
	
	//getters
	public Customer getCusotmer()
	{
		return new Customer (this.customer);
	}
	public Day getDay()
	{
		return this.orderDay;
	}
	public Day getOrderDay()
	{
		return this.orderDay;
	}
	public int getOrderNo()
	{
		return this.orderNo;
	}
	public int getOrderTime()
	{
		return this.orderTime;
	}
	public int getTotalItems()
	{
		return this.beverages.size();
	}

}
