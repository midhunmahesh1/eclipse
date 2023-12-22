package tes_tng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Guru99upload {
	ChromeDriver driver;
	String url="https://demo.guru99.com/test/upload/";
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("F:\\Firstprogram.class");
		
		
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}
	

}
