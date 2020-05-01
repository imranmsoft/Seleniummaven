package com.bitm.NewtoursAutomationMaven.Uitls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DriverManager {
	 static {
		 System.setProperty("webdriver.gecko.driver", "F:\\Selenium Files\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	 }
	 
	 // Driver Initialization
  public static WebDriver fireFoxDriver = new FirefoxDriver();
  
  //Constructor // private within the same class
  
//  // test method
//  @Test
//  public void DriverExecutionTest(){
//	  System.out.println("Driver Executed successfully");
//  }
  
  
  
  // constructor for garbage colletion 
  private DriverManager(){
	  
	  
  }
}

