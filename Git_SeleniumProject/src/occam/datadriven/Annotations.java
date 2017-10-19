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
		
	@Test(groups ={"Priority1"}, dataProvider="getData")
	public void ParameterizedData(String username, String password, String id){
		System.out.println("The username is " + username + "and password is " + password + " " + id);
	}
		
	//Parameterizing data	
	//@DataProvider parameterize the input for the test listed above.	
	@DataProvider
	public Object[][] getData(){
		// i stands for number of times test should run
		// j stands for no# of parameters it should send for one go...
		
		Object[][] data= new Object[3][3];
		data[0][0] = "1_username";
		data[0][1] = "1_password";
		data[0][2] = "1_id";
		
		data[1][0] = "2_username";
		data[1][1] = "2_password";
		data[1][2] = "2_id";
		
		data[2][0] = "3_username";
		data[2][1] = "3_password";
		data[2][2] = "3_id";
		
		return data;
		
		
		
	}
}
