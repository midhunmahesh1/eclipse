package tes_tng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Crossbrowsertesting {
	WebDriver driver;
	parameter("browser")
	@BeforeTest
	public void setup()
	{
		if(browser.equalsIgnorecase("chrome"))
		driver=new ChromeDriver();
	}
	else (browser.equalsIgnorecase("edge"))
	{
	driver=new EdgeDriver();
}
@Test
public void test()
{
	driver.get("https://www.google.com);

	
}
}
