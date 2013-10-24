package TestNG;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestOne {
	
	@BeforeTest
	public void openConnection(){
		System.out.println("opening database connection");
	}
	
	@AfterTest
	public void closeConnection(){
		System.out.println("closing database connection");
	}
	
	@BeforeMethod
	public void openBrowser(){
		System.out.println("executing browser");
	}
	@AfterMethod
	public void closBrowser(){
		System.out.println("executing browser close");
	}
	@Test
	public void accountLogin(){
		System.out.println("logging into account");
	}
	
	@Test
	public void registerAccount(){
		System.out.println("executing registrations");
	}
}
