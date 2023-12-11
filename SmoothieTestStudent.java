import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmoothieTestStudent {
	
	Smoothie smoothie1 = new Smoothie("Mango", Size.SMALL,4,true);
	Smoothie smoothie2 = new Smoothie("Mango", Size.SMALL,4,true);
    Smoothie smoothie3 = new Smoothie("Berry", Size.LARGE,6,false);
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testEquals()
	{
		assertTrue(smoothie1.equals(smoothie2));
		
	}
	
	@Test
	public void testCalcPrice()
	{
		assertEquals(5.5,smoothie1.calcPrice());
		assertEquals(7.0,smoothie3.calcPrice());
	}
	
	@Test
	public void testToString()
	{
		assertEquals("Mango,SMALL,true,4,5.5",smoothie1.toString());
	}
	
	@Test
	public void testGetNumOfFruits()
	{
		assertEquals(4,smoothie1.getNumOfFruits());
	}
	
	@Test
	public void testGetAddProtien()
	{
		assertFalse(smoothie3.getAddProtien());
	}

}
