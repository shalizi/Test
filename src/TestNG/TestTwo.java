package TestNG;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestTwo {
	
	@BeforeTest
	public void isLoggedIn(){
		if(! accountLogin()){
			throw new SkipException("skipping sellItems test, because user login failed");
		}
		
	}
	
	
	@Test
	public void sellItems(){
		System.out.println("executing sell of items");
	}

	public Boolean accountLogin(){
		//return true; 
		return false;
	}
}
