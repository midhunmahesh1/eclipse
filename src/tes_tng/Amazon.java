package tes_tng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon {
	ChromeDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test()
	{
		driver.get("https:www.amazon.com");
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
}
	
}