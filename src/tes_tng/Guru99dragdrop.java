package tes_tng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99dragdrop {
	ChromeDriver driver;
	String url="https://demo.guru99.com/test/drag_drop.html";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void test()
	{
	WebElement amount=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement amounts=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement account=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement accounts=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		Actions act=new Actions(driver);
		act.dragAndDrop(amount,amounts);
		act.dragAndDrop(bank, account);
		act.dragAndDrop(sales,accounts);
		act.perform();
	}
	

}
