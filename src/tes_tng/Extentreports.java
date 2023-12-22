package tes_tng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreports {
	ChromeDriver driver;
	String url="https://www.facebook.com";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	@BeforeTest
	public void setup()
	{
		reporter=new ExtentHtmlReporter("./Reports/myreport1.html");
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("functionaltest");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname","localhost");
		extent.setSystemInfo("os","windows10");
		extent.setSystemInfo("testername","abc");
		extent.setSystemInfo("browsername","chrome");
		
		
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void test()
	{
		test=extent.createTest("fbtitleverification");
		String Exp="facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(Exp,actual);
	}

}
