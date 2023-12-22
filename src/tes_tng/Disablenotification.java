package tes_tng;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Disablenotification {
	ChromeDriver driver;
	String url="https://www.justdial.com/";
	@BeforeMethod
	public void setup()
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		driver=new ChromeDriver(op);
	}
@Test
public void test()
{
driver.get(url);
}
}

