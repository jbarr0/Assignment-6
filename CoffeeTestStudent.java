import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoffeeTestStudent {
	
	Coffee coffee1 = new Coffee ("Latte",Size.MEDIUM, true,true);
	Coffee coffee2 = new Coffee ("Latte",Size.MEDIUM, true,true);
	Coffee coffee3= new Coffee ("Mocha",Size.LARGE, true,false);

	@BeforeEach
	void setUp() throws Exception {
	
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testEquals()
	{
		assertTrue(coffee1.equals(coffee2));
		
	}
	
	@Test
	public void testCalcPrice()
	{
		assertEquals(4.0,coffee1.calcPrice());
		assertEquals(4.50,coffee3.calcPrice());
	}
	
	@Test
	public void testToString()
	{
		assertEquals("Latte,MEDIUM,true,true,4.0",coffee1.toString());
	}
	
	@Test
	public void testGetExtraShot()
	{
		assertTrue(coffee1.getExtraShot());
	}
	
	@Test
	public void testGetExtraSyrup()
	{
		assertFalse(coffee3.getExtraSyrup());
	}
	

}
