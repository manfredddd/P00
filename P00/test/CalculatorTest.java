import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}


	@Test
	public final void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765; 
		
			Calculator cal = new Calculator();
			int actual = cal.add(a,b); 
			
			int expected = 9999;
			assertEquals (expected, actual);
	}
	
	@Test
	public final void testSubtract() { 
		int a = 9876;
		int b = 4321; 
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		
		int expected = 5555;
		assertEquals(actual, expected);
		
	}
	
	@Test
	public final void testMultiply() {
		int a = 4321; 
		int b = 1234; 
		
		Calculator cal = new Calculator(); 
		int actual = cal.multiply(a,b); 
		
		int expected = 5332114; 
		assertEquals(actual, expected);
		
	}
	
	@Test
	public final void testDivide() { 
		int a = 4321; 
		int b = 1234; 
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 3;
		assertEquals(actual, expected);
		
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
}
