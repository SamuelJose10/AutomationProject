package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	WebDriver driver;
	By emailid=By.xpath("//*[@id=\"customer_login\"]/div[1]/input");
	By pass=By.xpath("//*[@id=\"customer_login\"]/div[2]/input");
	By login=By.xpath("//*[@id=\"customer_login\"]/button");
	By searchfield=By.xpath("//*[@id=\"search-desktop\"]/input");
    By product=By.xpath("//*[@id=\"searchModal\"]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]");
    By cart=By.xpath("//button[@type='submit']");
	By check=By.xpath("//*[@id=\"checkout2\"]");
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void set(String email,String password)
	{
		driver.findElement(emailid).sendKeys("email");
		driver.findElement(pass).sendKeys("password");
	}
	
	public void buttonclick()
	{
		driver.findElement(login).click();
	}
	
	public void homepage()
	{
		WebElement text=driver.findElement(searchfield);
		text.sendKeys("bar soap");
		text.sendKeys(Keys.RETURN);
	}
	
	public void products()
	{
		
		driver.findElement(product).click();
		
	}
	public void add() {
		driver.findElement(cart).click();
	}
	
	public void checkout()
	{
		driver.findElement(check).click();
		
	}
	

}
