import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlcoholTestStudent {
	Alcohol alcohol1 = new Alcohol ("Jack",Size.MEDIUM,true);
	Alcohol alcohol2 = new Alcohol ("Jack",Size.MEDIUM,true);	
	Alcohol alcohol3 = new Alcohol ("Fireball",Size.SMALL,false);
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	@Test
	public void testEquals()
	{
		assertTrue(alcohol1.equals(alcohol2));
		
	}
	
	@Test
	public void testCalcPrice()
	{
		assertEquals(3.6,alcohol1.calcPrice());
		assertEquals(2.0,alcohol3.calcPrice());
	}
	
	@Test
	public void testToString()
	{
		assertEquals("Jack,MEDIUM,true,3.6",alcohol1.toString());
	}
	@Test
	public void testGetIsWeekend()
	{
		assertTrue(alcohol1.getIsWeekend());
		assertFalse(alcohol3.getIsWeekend());
	}

}
