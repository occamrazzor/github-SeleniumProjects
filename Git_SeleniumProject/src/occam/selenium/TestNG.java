package occam.selenium;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG{
// BeforeMethod will run before each @Test executes 
	@BeforeMethod
	public void RunningBeforeTest(){
		System.out.println("@BeforeMethod Delete cookies before each test");
	}
	@AfterMethod
	public void RunningAfterMethod(){
		System.out.println("@AfterMethod Delete cookies after each test");
	}
	
	@BeforeTest
	public void BeforeTesting(){
		System.out.println("@BeforeTest Delete cookies before starting test");
	}
	@AfterTest
	public void AfterTesting(){
		System.out.println("@AfterTest Delete cookies after test completion");
	}
	
	@Test
	public void TestNumber1(){
		System.out.println("Selecting Element #1");
	}
	
	@Test
	public void TestNumber2(){
		System.out.println("Selecting Element #2");
	
	}
	
	@Test
	public void TestNumber3(){
		System.out.println("Selecting Element #3");
	
	}
	
	@Test
	public void TestNumber4(){
		System.out.println("Selecting Element #4");
	
	}
	
	@Test
	public void TestNumber5(){
		System.out.println("Selecting Element #5");
	
	}
	
}