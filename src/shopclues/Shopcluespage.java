package shopclues;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Shopcluespage {
	WebDriver driver;
	By searchbox=By.xpath("//*[@id=\"autocomplete\"]");
	By click=By.xpath("//*[@id=\"search\"]/a");
	By itemselect=By.xpath("//*[@id=\"product_list\"]/div[3]/div[1]/a");
	By size=By.xpath("//*[@id=\"5128328\"]");
	By addtocart=By.xpath("//*[@id=\"add_cart\"]");
	By itemselect2=By.xpath("//*[@id=\"det_img_150527600\"]");
	By size2=By.xpath("//*[@id=\"5128328\"]");
	By addtocart2=By.xpath("//*[@id=\"add_cart\"]");
	public Shopcluespage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String shoes)
	{
		driver.findElement(searchbox).sendKeys(shoes);
	}
	public void go()
	{
		driver.findElement(click).click();
		driver.findElement(itemselect).click();
		String parentWindow  =  driver.getWindowHandle();
		System.out.println("parent window Title"+driver.getTitle());
		//driver.findElement(By.xpath("//*[@id=\"product_list\"]/div[3]/div[1]/a")).click();
		
	
		
			
			Set<String>allWindowhandles=driver.getWindowHandles();
			for (String handle:allWindowhandles)
			{
				if (!handle.equalsIgnoreCase(parentWindow)) 
				{
					driver.switchTo().window(handle);
					JavascriptExecutor jse = (JavascriptExecutor)driver;
	    			jse.executeScript("scroll(0, 600);");	
	    			driver.findElement(size).click();
	    			driver.findElement(addtocart).click();
	    			driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/ul/li[4]/a")).click();
			//System.out.println(s);
			//driver.close();
				} 
				driver.switchTo().window(parentWindow);
				}
				
			}
	
	
	}
					
		
	



