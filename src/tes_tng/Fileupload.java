package tes_tng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Fileupload {
ChromeDriver driver;
String url="https://www.iLovepdf.com/word_to_pdf";
@BeforeMethod
public void setup()
{
	driver=new ChromeDriver();
	driver.get(url);
}
@Test
public void test() throws Exception
{
	driver.get(url);
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
	fileupload("F:\t1.docx");
}
public void fileupload(String p)throws AWTException, InterruptedException
{
	StringSelection strSelection=new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection,null);
	Robot robot=new Robot();
	robot.delay(3000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	robot.delay(3000);
	
	
}
}
