package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
	WebDriver driver;
	@FindBy (id="email")
	WebElement fbemail;
	
	@FindBy (id="pass")
	WebElement fbpassword;
	@FindBy(name="login")
	WebElement loginbutton;
	
	public Fbloginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
public void setvalues(String email,String password)
{
fbemail.sendKeys(email);
	fbpassword.sendKeys(password);
	
}
public void login()
{
	loginbutton.click();
}
}
