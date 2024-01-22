package tes_tng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Windowshandle {
	ChromeDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test()
	{
		driver.get("https://demo.guru99.com/popup.php");
		String parentWindow  =  driver.getWindowHandle();
		System.out.println("parent window Title"+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set<String>allWindowhandles=driver.getWindowHandles();
		for (String handle:allWindowhandles)
		{
			if (!handle.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(handle);
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc");
		//System.out.println(s);
		driver.close();
			} 
			driver.switchTo().window(parentWindow);
			}
			
		}
	}


