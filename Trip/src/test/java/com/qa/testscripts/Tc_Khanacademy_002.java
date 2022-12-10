package com.qa.testscripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.qa.pages.khanpages;

public class Tc_Khanacademy_002 extends Testbase {

	khanpages pages;
	@Parameters({"Browser","Url"})
	@Test
	public void Search() throws InterruptedException {
		pages = new khanpages(Driver);
		pages.signup().click();
		Thread.sleep(3000);
		pages.month().click();
		Thread.sleep(3000);
		pages.march().click();
		Thread.sleep(3000);
		pages.day().click();
		Thread.sleep(3000);
		pages.num().click();
		Thread.sleep(3000);
		pages.year().click();
		Thread.sleep(3000);
		pages.num2().click();
		Thread.sleep(3000);
		pages.user().click();
		Thread.sleep(3000);
		pages.email().sendKeys("19f212@gmail.com");
		Thread.sleep(3000);
		pages.username().sendKeys("guhanhari109");
		Thread.sleep(3000);
		pages.pass().sendKeys("gouti@12");
		Thread.sleep(3000);
		pages.submit().click();
		Thread.sleep(8000);
		pages.radio().click();
		Thread.sleep(5000);
		pages.con().click();
		Thread.sleep(5000);
		pages.computer().click();
		Thread.sleep(5000);
		pages.con2().click();
		Thread.sleep(5000);
		System.out.println(Driver.getTitle());
		Thread.sleep(5000);
//		pages.search().sendKeys("html"+Keys.ENTER);
		Thread.sleep(5000);
		System.out.println(pages.page().getText());
//		Driver.navigate().back();
	}
}
