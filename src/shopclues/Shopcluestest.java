package shopclues;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Shopcluestest {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/");
	}
@Test
public void test()
{
	Shopcluespage ob=new Shopcluespage(driver);
	ob.setvalues("shoes");
	ob.go();
	
	
	

	
	
	
}
	

}
