package tes_tng;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Datadriventest {
	ChromeDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test() throws Exception
	{
		FileInputStream f=new FileInputStream("C:\\Users\\midhu\\Downloads\\FB.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet sh=wb.getSheet("Sheet1");
		int count=sh.getLastRowNum();
		for(int i=1;i<=count;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("username="+username);
			System.out.println("password="+password);
			driver.get("https://www.facebook.com/");
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			
		}
	}
	

}
