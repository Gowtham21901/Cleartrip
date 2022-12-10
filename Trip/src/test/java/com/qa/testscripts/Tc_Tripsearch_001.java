package com.qa.testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.Trippages;

import com.qa.utility.Excelutility;

public class Tc_Tripsearch_001 extends Testbase {

//	Trippages tpages ;
	
	@Parameters({"Browser","Url"})
	
	@DataProvider(name="getdata")
	public String[][] getData()throws IOException{
		
		String xFile="C:\\Users\\SMART\\Desktop\\project\\Trip\\src\\test\\java\\com\\qa\\testdata\\Book2.xlsx";
		String xSheet="sheet1";
		int rowCount = Excelutility.getRowCount(xFile, xSheet);
		int cellCount = Excelutility.getCellCount(xFile, xSheet, rowCount);
		System.out.println("rows = "+rowCount);
		System.out.println("cells = "+cellCount);
		
		String[][] data = new String[rowCount][cellCount];
		
		for(int i=1; i<=rowCount; i++) {
			for(int j=0;j<cellCount;j++) {
				
				data[i-1][j] = Excelutility.getCellData(xFile,xSheet,i,j);
			}
		}
	return data;
	}
	@Test(dataProvider="getdata")
	public void getTest(String Source, String Destination ) throws IOException, InterruptedException, AWTException {
		PageFactory.initElements(Driver, Trippages.class);
		Thread.sleep(3000);
		Robot r=new Robot();
		
		Trippages.click1.click();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(5000);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(5000);

		Trippages.source.sendKeys(Source);
		Thread.sleep(5000);
		Trippages.air.click();
		Thread.sleep(5000);
		
		Trippages.click2.click();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(5000);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(5000);
		
		Trippages.dest.sendKeys(Destination);
		Thread.sleep(5000);
		Trippages.air2.click();
		Thread.sleep(5000);
		Trippages.search.click();
		Thread.sleep(5000);
		
		Driver.navigate().back();
		Thread.sleep(8000);
//		Trippages.source.clear();
//		Thread.sleep(8000);
//		Trippages.dest.clear();
		
	}
}

