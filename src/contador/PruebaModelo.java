package contador;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PruebaModelo {
	
	@BeforeClass
	public static void setupFirst() {
		System.out.println("Setup First");
	}
	
	@AfterClass
	public static void tearDownLast() {
		System.out.println("Tear Down Last");
	}
	
	@Before
	public void setup() {
		System.out.println("Setup");
	}
	
	@After
	public void tearDown() {
		System.out.println("After");
	}
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
}
