package tes_tng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertion {
	ChromeDriver driver;
	String url="https:www.google.com";
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void test()
	{
		String exptitle="Google";
		String actualtitle=driver.getTitle();
		System.out.println("title="+actualtitle);
		Assert.assertEquals(actualtitle,exptitle);
		System.out.println("title verified");
		
		
		
	}

}
