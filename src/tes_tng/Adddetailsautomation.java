package tes_tng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Adddetailsautomation {
	ChromeDriver driver;
	String url="https://automationexercise.com/login";
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
@Test
public void test()
{
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("midhun");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("midhunmahesh@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
	driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("midhunmidhun");
	WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"days\"]"));
	WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"months\"]"));
	WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"years\"]"));
	driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("midhun");
	driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("mahesh");
	driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("abc house shoranur");
	Select day=new Select(dayelement);
	day.selectByValue("12");
	Select month=new Select(monthelement);
	month.selectByVisibleText("January");
	Select year=new Select(yearelement);
	year.selectByValue("2002");
	WebElement countryelement=driver.findElement(By.xpath("//*[@id=\"country\"]"));
	Select country=new Select(countryelement);
	country.selectByValue("India");
	driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("kerala");
	driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("shoranur");
	driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("67777");
	driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("6757777");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button")).click();
	
	
}
}
