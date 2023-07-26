package Test;

import org.testng.annotations.Test;

import Base.Url;
import Page.Loginpage;

public class Logintest extends Url{
	
	@Test
	public void setup() throws Exception
	{
		Loginpage a=new Loginpage(driver);
		a.set("josesamuel382@gmail.com","Jose123@sam");
		a.buttonclick();
		
		a.homepage();
		Thread.sleep(3000);
		a.products();
		Thread.sleep(3000);
		
		a.add();
		Thread.sleep(3000);
		a.checkout();
	}
	
	

}
