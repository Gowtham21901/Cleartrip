package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Trippages {
 
	WebDriver driver;
	
//	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]")
//	public static WebElement close;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[1]/input")
	public static WebElement click1;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[1]/input")
	public static WebElement source;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[1]/div[2]")
	public static WebElement air;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[3]/input")
	public static WebElement click2;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[3]/input")
	public static WebElement dest;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[3]/div[2]")
	public static WebElement air2;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[3]/div/div[2]/span")
	public static WebElement search;
	
	
}
