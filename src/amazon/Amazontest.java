package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazontest {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
@Test
public void test()
{
	Amazonpage ob=new Amazonpage(driver);
	ob.setvalues("mobile");
	ob.go();
	
}

}
