package tes_tng;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Testng
	
	{
		@BeforeTest
		public void setUp()
		{
			System.out.println("browseropen");
		}
		@BeforeMethod
		
		public void urlload()
		{
			System.out.println("url loading");
		}
		@Test(groups="smoke")
		public void test1()
		{
			System.out.println("test1");
		}
		@Test(groups={"sanity","regression"})
		public void test2()
		{
			System.out.println("test2");
		}
		@AfterMethod
		public void aftermthd()
		{
			System.out.println("aftermethod");
		}
		@AfterTest
		public void teatDown()
		{
			System.out.println("browserclose");
		}
	}
	


