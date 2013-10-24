package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider="getData")
	public void testMail(String to, String sub, String msg){
		
	}
	@DataProvider
	public Object[][] getData(){
		Object [][] data = new Object[2][3];
		
		data[0][0]="xyz@gmail.com";
		data[0][1]="hello";
		data[0][2]="how are you?";
		
		data[1][0]="abc@gmail.com";
		data[1][1]="hi";
		data[1][2]="I'm good, thx";
		
		return data;
		
		
	}
	
}
