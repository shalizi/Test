package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingAssertions {
	
	@Test
	public void getGoogle(){
		String expectedTitle="Google1";
		String actualTitle="Google";
	
		System.out.println("before assertion");
		try{
		Assert.assertEquals(expectedTitle, actualTitle);
		}catch(Throwable t){
			System.out.println("error");
		}
		System.out.println("after assertion");
	}
}
//NOTE: if assertions fail, nothing after it will run.. but there is a work around.. this will not affect tests included in xml 
//configuration file.... you can throw a try-catch to overcome this.. NOT recommended, if you handle the error, then the test
//will be marked as passed in the html reports