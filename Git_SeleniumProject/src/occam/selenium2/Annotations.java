package occam.selenium2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	public void installsoftware() {
		System.out.println("BeforeSuite will run first before any other tests in files within the whole package");
	}

	@Test
	public void testing1(){
		System.out.println("Testcase #1 run");
	}

	@Test
	public void testing2(){
		System.out.println("Testcase #2 run");
	}
	@Test
	public void testing3(){
		System.out.println("Testcase #3 run");
	}
	@Test
	public void testing4() {
		System.out.println("Testcase #4 run");
	}

	@AfterSuite
	public void testingAgain() {
		System.out.println("AfterSuite will run after all the testcases run are complete");
	}
}
