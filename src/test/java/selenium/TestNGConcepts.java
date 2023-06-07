package selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGConcepts {

	@Test
	public void testSecnario1() {
		System.out.println("Rajan");
	}
	@BeforeMethod
	public void chunni() {
		System.out.println("hello");
	}
	@AfterMethod
	public void munni() {
		System.out.println("helloMunni");
	}
}
