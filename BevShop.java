import java.util.ArrayList;

public class BevShop implements BevShopInterface {
	
	private int numOfAlcDrinks =0;
	ArrayList<Order> orders = new ArrayList<Order>();
	
	public boolean isValidTime (int time)
	{
		if (time > MIN_TIME && MAX_TIME > time )
		{
			return true;
		}
		return false;
	}
	
	
	public int getMinAgeForAlcohol()
	{
		return MIN_AGE_FOR_ALCOHOL;
	}
	
	public boolean isMaxFruit(int numOfFruits)
	{
		if (numOfFruits > getMaxNumOfFruits())
			return true;
		else
			return false;
	}

	public int getMaxOrderForAlcohol()
	{
		return MAX_ORDER_FOR_ALCOHOL;
	}
	
	public boolean isEligibleForMore()
	{
		if (numOfAlcDrinks == getMaxOrderForAlcohol())
			return true;
		else
			return false;
	}
	
	public int getNumOfAlcoholDrink()
	{
		return this.numOfAlcDrinks;
	}
	public boolean isValidAge(int age)
	{
		if (age >= getMinAgeForAlcohol() )
			return true;
		else
			return false;
	}
	public void startNewOrder(int time, Day day, String customerName, int customerAge)
	{
		Customer newCustomer = new Customer(customerName,customerAge);
		Order newOrder = new Order (time,day,newCustomer);
		orders.add(newOrder);
		
	}
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		orders.get(orders.size()-1).addNewBeverage(bevName, size, extraShot, extraSyrup);
		
	}
	public void processAlcoholOrder(String bevName, Size size)
	{
		orders.get(orders.size()-1).addNewBeverage(bevName, size);
		this.numOfAlcDrinks++;
	}
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein)
	{
		{
			orders.get(orders.size()-1).addNewBeverage(bevName, size, numOfFruits, addProtein);
		}
	}
	public int findOrder(int orderNo)
	{
		for (int i =0; i < orders.size(); i++)
		{
			if (orderNo == orders.get(i).getOrderNo())
				return i;
			
		}
		return -1;
	}
	public double totalOrderPrice(int orderNo)
	{
		return orders.get(findOrder(orderNo)).calcOrderTotal();

	}
	public double totalMonthlySale()
	{
		double monthlySales =0.0;
		for ( int i =0; i<orders.size();i++)
		{
			monthlySales+= orders.get(i).calcOrderTotal();
		}
		return monthlySales;
	
	}

	public int totalNumOfMonthlyOrders()
	{
		return orders.size();
	}
	
	public Order getCurrentOrder()
	{
		return orders.get(orders.size()-1);
	}
	public Order getOrderAtIndex(int index)
	{
		return orders.get(index);
	}

	
	public int getMaxNumOfFruits()
	{
		return MAX_FRUIT;
	}
	

	@Override
	public void sortOrders() {
		orders.sort(null);
	}
	




	
	

	
	

}
