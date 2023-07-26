package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Url {
	public WebDriver driver;
	@BeforeClass
	public void a()
	{
		driver=new ChromeDriver();
		driver.get("https://deyga.in/account/login");
		driver.manage().window().maximize();
	}

}
