package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Amazonpage {
	WebDriver driver;
	By searchbox=By.xpath("//*[@id=\"twotabsearchtextbox\"]");
	By click=By.xpath("//*[@id=\"nav-search-submit-button\"]");
	By phoneselect=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img");
	By addtocart=By.xpath("//*[@id=\"add-to-cart-button\"]");
	public Amazonpage(WebDriver driver)
	{
		this.driver=driver;
	}
public void setvalues(String email)
{
	driver.findElement(searchbox).sendKeys(email);
}
public void go()
{
	driver.findElement(click).click();
	driver.findElement(phoneselect).click();
	driver.findElement(addtocart).click();
}

}
