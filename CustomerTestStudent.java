import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTestStudent {
	
	Customer c1 = new Customer ("TAY-K",100 );

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testGetName()
	{
		assertEquals("TAY-K",c1.getName());
	}
	
	@Test
	public void testGetAge()
	{
		assertEquals(100,c1.getAge());

	}
	
	@Test
	public void testToString()
	{
		assertEquals("TAY-K 100", c1.toString());
	}
}
