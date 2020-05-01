package com.bitm.NewtoursAutomationMaven.Test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.AutomationMaven.DTO.FlighBookDTO;
import com.bitm.AutomationMaven.DTO.FlightFinderDTO;
import com.bitm.AutomationMaven.DataProvider.FlightBookingDataProvider;
import com.bitm.AutomationMaven.DataProvider.FlightFinderProvider;
import com.bitm.NewtoursAutomationMaven.Uitls.DriverManager;
import com.bitm.NewtoursAutomationMaven.Uitls.UrlTextUitls;
import com.bitm.NewtoursAutomationMaven.Uitls.XpathUtils;

public class FlightBookTest {
	private WebDriver driver = null;
	private WebDriver wait;

	@Test
	public void checkFlightBookPageTitle() {
		driver = DriverManager.fireFoxDriver;
		// driver.get(UrlTextUitls.Url.BASE_URL);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element = wait.until(ExpectedConditions
				.elementToBeClickable(By
						.xpath(XpathUtils.FlightFinder.OneWay_BTN)));
		 Assert.assertEquals(driver.getTitle(),
		 UrlTextUitls.TEXT.FlightBook_Page_Titel);
	}

	@Test(dataProvider = "ImranBookdata", dataProviderClass = FlightBookingDataProvider.class)
	public void flightBookTest(List<FlighBookDTO> flightbook) throws InterruptedException {
		System.out.println("Enter into Flight Book  page");
		System.out.println(" intial fileBookList:: "+flightbook);
		int fbCount=0;
		for (FlighBookDTO flbook : flightbook) {
			System.out.println("fileBookDTO::- "+flbook);
			System.out.println("GetFnames :" + flbook.getFnames());
			//int count =0;
			for (String name : flbook.getFnames()) {
				System.out.println("xpath Uitls value : "
						+ XpathUtils.FlightBook.fname.replace("*",
								Integer.toString(fbCount)));
				driver.findElement(
						By.xpath(XpathUtils.FlightBook.fname.replace("*",
								Integer.toString(fbCount)))).sendKeys(name);
				// driver.findElement(By.xpath(XpathUtils.FlightBook.fname.replace("*",
				// Integer.toString(count)).sendKeys(name));

			System.out.println("First Name value : " + name);
				System.out.println("Vlaue of count : " + fbCount);
				//count++;
				System.out.println("Vlaue After count : " + fbCount);
			}

			// Last Name
			System.out.println("Last name starting");

			for (String lname : flbook.getLname()) {
				System.out.println("GetLnames :" + flbook.getLname());	
				
				System.out.println("xpath Uitls value : "+ XpathUtils.FlightBook.lname.replace("*",
						Integer.toString(fbCount)));
				driver.findElement(By.xpath(XpathUtils.FlightBook.lname.replace("*",
						Integer.toString(fbCount)))).sendKeys(lname);
				WebDriverWait wait = new WebDriverWait(driver, 10);
			}
			
			//Meal
			
			
			System.out.println("Meal starting");

			for (String meal : flbook.getMeal()) {
				System.out.println("GetLnames :" + flbook.getMeal());	
				
				System.out.println("xpath Uitls value : "+ XpathUtils.FlightBook.meal.replace("*",
						Integer.toString(fbCount)));
				driver.findElement(By.xpath(XpathUtils.FlightBook.meal.replace("*",
						Integer.toString(fbCount)))).sendKeys(meal);
				WebDriverWait wait = new WebDriverWait(driver, 10);
			}
			fbCount++;
				
		   
			
		}
		// Again come back to First Row of Excel Sheet 
		WebDriver wait;
		FlighBookDTO flbook = flightbook.get(0);
		System.out.println("Card Info " + flbook);
		// Card Selection
		driver.findElement(By.xpath(XpathUtils.FlightBook.CCARD_SLOT)).sendKeys(flbook.getCcard());
		
		//Number Place
		     driver.findElement(By.xpath(XpathUtils.FlightBook.CARD_NUMBER)).sendKeys(flbook.getNumber());
		    driver.findElement(By.xpath(XpathUtils.FlightBook.EDATE_SLOT))
			 .sendKeys(flbook.getEdate());
			
			  driver.findElement(By.xpath(XpathUtils.FlightBook.EYEAR_SLOT))
			 .sendKeys(flbook.getEyear());
			
			  driver.findElement(By.xpath(XpathUtils.FlightBook.FRSTNAME_SLOT))
			 .sendKeys(flbook.getFrstname());
			
			 driver.findElement(By.xpath(XpathUtils.FlightBook.MIDNAME_SLOT))
			 .sendKeys(flbook.getMidname());
			
			 driver.findElement(By.xpath(XpathUtils.FlightBook.LASTNAME_SLOT))
			 .sendKeys(flbook.getLastname());
			
			
			 driver.findElement(By.xpath(XpathUtils.FlightBook.TICKETLESS_BTN))
			 .click();
			// Clear the Address
			 driver.findElement(By.xpath(XpathUtils.FlightBook.BILLADD_SLOT)).clear();
			 driver.findElement(By.xpath(XpathUtils.FlightBook.BILLADD_SLOT))
			 .sendKeys(flbook.getBilladd());
			 
			// clear city
			 driver.findElement(By.xpath(XpathUtils.FlightBook.BILLCITY_SLOT)).clear();
			 driver.findElement(By.xpath(XpathUtils.FlightBook.BILLCITY_SLOT))
			 .sendKeys(flbook.getCity());
			 
			// clear State
			 driver.findElement(By.xpath(XpathUtils.FlightBook.BILLSTATE_SLOT)).clear();
			 driver.findElement(By.xpath(XpathUtils.FlightBook.BILLSTATE_SLOT))
			 .sendKeys(flbook.getState());
			 
			 //Clear Post Code
			 driver.findElement(By.xpath(XpathUtils.FlightBook.BILLPOST_SLOT)).clear();
			
			 driver.findElement(By.xpath(XpathUtils.FlightBook.BILLPOST_SLOT))
			 .sendKeys(flbook.getPostalcode());
			
			 
		     driver.findElement(By.xpath(XpathUtils.FlightBook.BILLCOUNTRY_SLOT))
	         .sendKeys(flbook.getCountry());
		    
			
		     
			 driver.findElement(By.xpath(XpathUtils.FlightBook.BILLING_BTN))
			 .click();
			
			
			 // Clear Del Addres
			 driver.findElement(By.xpath(XpathUtils.FlightBook.DELADD_SLOT)).clear();
			 
			 driver.findElement(By.xpath(XpathUtils.FlightBook.DELADD_SLOT))
			 .sendKeys(flbook.getDeladd());
			// Clear Del City
			 driver.findElement(By.xpath(XpathUtils.FlightBook.DELCITY_SLOT)).clear();
			 driver.findElement(By.xpath(XpathUtils.FlightBook.DELCITY_SLOT))
			 .sendKeys(flbook.getDelcity());
			 
			 // Clear Del State
			 driver.findElement(By.xpath(XpathUtils.FlightBook.DELSTATE_SLOT)).clear();
			
			 driver.findElement(By.xpath(XpathUtils.FlightBook.DELSTATE_SLOT))
			 .sendKeys(flbook.getDelstate());
			 
			 // Clear Del Post
			 driver.findElement(By.xpath(XpathUtils.FlightBook.DELPOST_SLOT)).clear();
			 driver.findElement(By.xpath(XpathUtils.FlightBook.DELPOST_SLOT))
			 .sendKeys(flbook.getDelpost());
			 Thread.sleep(8000);
			/// driver.findElement(By.xpath(XpathUtils.FlightBook.DELCOUNTRY_SLOT))
			 //.sendKeys(flbook.getDelcountry());
			 driver.findElement(By.xpath("//select[@name='delCountry']//option[contains(text(),'BANGLADESH')]")).click();
			 
			 
			// Switching to Alert        
		        Alert alert = driver.switchTo().alert();		
		        		
		        // Capturing alert message.    
		        String alertMessage= driver.switchTo().alert().getText();		
		        		
		        // Displaying alert message		
		        System.out.println(alertMessage);	
		       Thread.sleep(5000);
		        		
		        // Accepting alert		
		        alert.accept();	
		        Thread.sleep(5000);
		        
		        //Click on Secure Puarchas Button
		        
		        driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
		        System.out.println("Secure Purchase Button Clicked Successfully");
		       
			

		
	}
	}

