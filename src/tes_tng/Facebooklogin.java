package tes_tng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebooklogin {
	ChromeDriver driver;
	String url="https://www.facebook.com";
	@BeforeMethod
	public void urlload()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Parameters({"username","password"})
	@Test
	public void logincheck(String username,String password)
	
	{
		@FindBy"//*[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@name='login']")).click();
	}	
	
	

}
