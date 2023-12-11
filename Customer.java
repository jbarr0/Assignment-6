
public class Customer {
	private String name;
	private int age;
	
	public Customer(String s, int a)
	{
		this.name =s;
		this.age =a;
	}
	
	public Customer (Customer c)
	{
		this.name = c.getName();
		this.age = c.getAge();
	}
	
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	
	public void setAge(int a)
	{
		this.age =a;
	}
	public void setName(String s)
	{
		this.name =s;
	}
	
	public String toString()
	{
		return this.name + " "+this.age;
	}
}
