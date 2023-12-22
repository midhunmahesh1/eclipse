package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.Fbloginpage;

public class Fblogintest {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
@Test
public void test()
{
	Fbloginpage ob=new Fbloginpage(driver);
	ob.setvalues("midhun2gmail.com","asdf");
	ob.login();
}
}
 