package tes_tng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Doubleandrightclick {
	ChromeDriver driver;
	String url="https://demo.guru99.com/test/simple_context_menu.html";
	@BeforeMethod
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get(url);
	}
	@Test
	public void test()
	{
		Actions act=new Actions(driver);
		webelement right=driver.findElement(By.xpath(""))
	}
			

}
