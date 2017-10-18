package occam.selenium;

import org.testng.annotations.Test;

public class DependencyAnnotations {

	@Test
	public void OpeningBrowser(){
		System.out.println("Executing Test# 1");
	}
	
	@Test(dependsOnMethods={"OpeningBrowser"})
	public void Login(){
		System.out.println("Executing Test# 2");
	}
	
	
	@Test(dependsOnMethods={"Login"})
	public void FlightBooking(){
		System.out.println("Executing Test# 3");
	}
	
	//@Test(enabled=false) will exclude the test from executing.
	@Test(enabled=false)
	public void Payment(){
		System.out.println("Executing Test# 4");
	}
}
