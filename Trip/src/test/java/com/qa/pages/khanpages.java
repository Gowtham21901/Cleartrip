package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class khanpages {
  WebDriver driver;
  
  @FindBy(linkText="Sign up")
  WebElement signup;
  public WebElement signup() {
	  return signup;
  }
  
  @FindBy(xpath="//*[@id=\"app-shell-root\"]/div/main/div[2]/div/div[3]/section[2]/div/div/div[2]/div/div/div[2]/div/div[1]/button/span")
  WebElement month;
  public WebElement month() {
	  return month;
  }
  
  @FindBy(xpath="/html/body/div[3]/div/div/div[3]/span")
  WebElement march;
  public WebElement march() {
	  return march;
  }
  
  @FindBy(xpath="//*[@id=\"app-shell-root\"]/div/main/div[2]/div/div[3]/section[2]/div/div/div[2]/div/div/div[2]/div/div[3]/button")
  WebElement day;
  public WebElement day() {
	  return day;
  }
  
  @FindBy(xpath="/html/body/div[3]/div/div/div[3]/span")
  WebElement num;
  public WebElement num() {
	  return num;
  }
  
  @FindBy(xpath="//*[@id=\"app-shell-root\"]/div/main/div[2]/div/div[3]/section[2]/div/div/div[2]/div/div/div[2]/div/div[5]/button/span")
  WebElement year;
  public WebElement year() {
	  return year;
  }
  
  @FindBy(xpath="/html/body/div[3]/div/div/div[13]/span")
  WebElement num2;
  public WebElement num2() {
	  return num2;
  }
  
  @FindBy(xpath="//*[@id=\"app-shell-root\"]/div/main/div[2]/div/div[3]/section[2]/div/div/div[2]/div[2]/div/button")
  WebElement user;
  public WebElement user() {
	  return user;
  }
  
  @FindBy(id="uid-labeled-text-field-1-wb-id-field")
  WebElement email;
  public WebElement email() {
	  return email;
  }
  
  @FindBy(id="uid-labeled-text-field-2-wb-id-field")
  WebElement username;
  public WebElement username() {
	  return username;
  }
  
  @FindBy(id="uid-labeled-text-field-3-wb-id-field")
  WebElement pass;
  public WebElement pass() {
	  return pass;
  }
  
  @FindBy(xpath="//*[@id=\"app-shell-root\"]/div/main/div[2]/div/div[3]/section[2]/div/nav/button[2]")
  WebElement submit;
  public WebElement submit() {
	  return submit;
  }
  
  @FindBy(xpath="//*[@id=\"uid-dialog-0-children\"]/div/div[2]/div[2]/label[4]/div[1]/input")
  WebElement radio;
  public WebElement radio() {
	  return radio;
  }
  
  @FindBy(xpath="//*[@id=\"__MODAL_PARENT__\"]/div/div[1]/div/div[2]/div[3]/span[2]/span[1]/button/div")
  WebElement con;
  public WebElement con() {
	  return con;
  }
  
  @FindBy(xpath="//*[@id=\"uid-dialog-0-children\"]/div/div[2]/div[5]/div[4]/label[1]")
  WebElement computer;
  public WebElement computer() {
	  return computer;
  }
  
  @FindBy(xpath="//*[@id=\"__MODAL_PARENT__\"]/div/div[1]/div/div[2]/div[3]/span[3]/span[1]/button")
  WebElement con2;
  public WebElement con2() {
	  return con2;
  }
  
//  @FindBy(xpath="//*[@id=\"top-header-container\"]/nav/div/div[1]/div[2]/a/div/div/svg/path")
//  WebElement search;
//  public WebElement search() {
//	  return search;
//  }
  
  @FindBy(xpath="/html")
  WebElement page;
  public WebElement page() {
	  return page;
  }
//  
  public khanpages(WebDriver Driver) {
		this.driver = Driver;
		PageFactory.initElements(Driver, this);
	}
}
