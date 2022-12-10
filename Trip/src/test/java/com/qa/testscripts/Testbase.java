package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {

	
	WebDriver Driver = null;
	
		
	
	@Parameters({"Browser" , "Url"})
	@BeforeClass
	public void setUp(String Browser,String Url)throws IOException, InterruptedException{
		
		if(Browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 Driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
           Driver = new EdgeDriver();
		}
		
		
		Driver.get(Url);
		Driver.manage().window().maximize();
		 Thread.sleep(5000);
//		Trippages.close.click();
		 Driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]")).click();
		 Thread.sleep(5000);
	}
	


@AfterClass
public void tearDown() throws IOException, InterruptedException
{
	
	Thread.sleep(3000);
	Driver.quit();
}

}
