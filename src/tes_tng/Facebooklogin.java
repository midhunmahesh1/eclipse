package tes_tng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebooklogin {
	ChromeDriver driver;
	String url="https://www.ebay.com/";
	@BeforeMethod
	public void urlload()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Parameters({"username","password"})
	@Test
	public void logincheck(String toys)
	
	{
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys(toys);
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
	}	
	
	

}
