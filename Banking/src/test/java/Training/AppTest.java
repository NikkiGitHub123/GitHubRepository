package Training;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @BeforeMethod
	public void UseridGeneration()
	{
		System.out.println("This block executes before each Test");
	}
	@BeforeTest
	public void Cookies()
	{
		System.out.println("This block executes Before all  Testcases");
		//delete cookies
	}
@AfterTest
public void Cookiesclose()
{
	System.out.println("This block executes after all  Testcases");
	//close the browesers
}
@AfterMethod
public void Reportadding()
{
	System.out.println("This block executes after each Test");
	System.out.println("Added new line of code");
}

@Test
@Parameters()
public void FlightBooking()
{
	
	System.out.println("Executing Test 1");
}

}
