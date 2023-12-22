package tes_tng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Buttonscreenshot {
	ChromeDriver driver;
	String url="https://demo.guru99.com/test/drag_drop.html";
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
@Test
public void test() throws IOException
{
File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(screenshot,new File("F://screenshot.png"));
WebElement button=driver.findElement(By.xpath("//*[@id=\"credit3\"]/a"));
File buttonscreenshot=button.getScreenshotAs(OutputType.FILE);
FileHandler.copy(buttonscreenshot,new File("./Screenshots/buttonscreenshot.png"));

	
}
}
