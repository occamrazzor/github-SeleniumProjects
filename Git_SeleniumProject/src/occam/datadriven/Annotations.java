package occam.datadriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Annotations {

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
		
	@Test(groups ={"Priority1"}, dataProvider = "getData")
	public void UserId(String username, String password){
		System.out.println("The username is " + username + "and password is" + password);
	}
		
		
	//@DataProvider parameterize the input for the test listed above.	
	@DataProvider
	public static Object[][] getData(){
		// i stands for number of times test should run
		// j stands for no# of parameters it should send for one go...
		
		return new Object[][]
		{{"testuser_1", "Test@1"}, {"testuser_2", "Test@2"}};
		
		
	}
}
