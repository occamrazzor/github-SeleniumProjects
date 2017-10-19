package occam.datadriven;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized {
	@Parameters({"useridtest"})
	@Test
	public void testingparameter(String userId){
		System.out.println("Test1 :");
		System.out.println("Executing test with the following parameter :\" useridtest \" from XML file: " + userId);
	}
	
	
}
