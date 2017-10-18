package occam.selenium2;

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
	
	//alwaysRun=true will execute even if Login test fails.
	@Test(dependsOnMethods={"Login"}, alwaysRun=true)
	public void FlightBooking(){
		System.out.println("Executing Test# 3");
	}
	
	//@Test(timeOut=5000) will pause the test from executing and will fail if the credit card
	//payment does not go thru with the duration.
	@Test(dependsOnMethods={"Login"},timeOut=5000)
	public void Payment(){
		System.out.println("Executing Test# 4");
	}
	
	//@Test(enabled=false) will exclude the test from executing.
		@Test(enabled=false)
		public void PrintInvoice(){
			System.out.println("Executing Test# 5");
		}
}
