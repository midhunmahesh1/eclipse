package tes_tng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Implicittime {
	ChromeDriver driver;
	String url="https://www.ebay.com/";
@BeforeTest
public void setup()
{
driver=new ChromeDriver();
driver.get(url);
}
@Test
public void test()
{
	WebElement electronics=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
	Actions act=new Actions(driver);
	act.moveToElement(electronics).perform();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30)); 
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"mainContent\\\"]/div[1]/ul/li[3]/a"))).click();
	
}


}