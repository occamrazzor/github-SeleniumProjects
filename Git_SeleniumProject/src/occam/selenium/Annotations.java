package occam.selenium;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Annotations{
	
	@BeforeSuite
	public void installsoftware(){
		System.out.println("BeforeSuite will run first before any other tests in files within the whole package");
	}
	@Test
	public void testing(){
		System.out.println("Testing");
	}
	@AfterSuite
	public void testingAgain(){
		System.out.println("TestingAgain");
	};
}
