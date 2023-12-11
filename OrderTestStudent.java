import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderTestStudent {
	Customer customer1 = new Customer ("Jason",21);
	Order order1 = new Order (12,Day.SUNDAY,customer1);
	Order order2= order1;
	

	@BeforeEach
	void setUp() throws Exception {
		order1.addNewBeverage("Jack Daniels",Size.LARGE);
		order1.addNewBeverage("Caramel", Size.LARGE , false, false);
		order1.addNewBeverage("Mango",Size.MEDIUM, 2, true);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testIsWeekend()
	{
		assertTrue(order1.isWeekend());
	}
	
	@Test
	public void testToString()
	{
		System.out.println(order1.toString());
	}
	
//	@Test
//	public void testGetBeverage()
//	{
//		assertEquals("",order1.getBeverage(2));
//	}

	@Test
	public void testCalcOrderTotal()
	{
		assertEquals(14.1,order1.calcOrderTotal());
	}
	
	@Test
	public void TestFindNumOfBeveType()
	{
		assertEquals(1,order1.findNumOfBeveType(Type.SMOOTHIE));
	}
	
	@Test 
	public void TestCompareTo()
	{
		assertEquals(order1.getOrderNo(),order2.getOrderNo());
	}
	
	@Test
	public void TestGestTotalItems()
	{
		assertEquals(3,order1.getTotalItems());
	}
}
