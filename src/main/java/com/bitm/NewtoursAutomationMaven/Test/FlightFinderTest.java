package com.bitm.NewtoursAutomationMaven.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.AutomationMaven.DTO.FlightFinderDTO;
import com.bitm.AutomationMaven.DTO.LoginDTO;
import com.bitm.AutomationMaven.DataProvider.FlightFinderProvider;
import com.bitm.AutomationMaven.DataProvider.LoginDataProvider;
import com.bitm.NewtoursAutomationMaven.Uitls.DriverManager;
import com.bitm.NewtoursAutomationMaven.Uitls.UrlTextUitls;
import com.bitm.NewtoursAutomationMaven.Uitls.XpathUtils;

public class FlightFinderTest {

	private WebDriver driver = null;

	@Test
	public void checkFlightFinderTitle() {
		driver = DriverManager.fireFoxDriver;
		System.out.println("Flight Finder");
		// driver.get(UrlTextUitls.Url.BASE_URL);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions
				.elementToBeClickable(By
						.xpath(XpathUtils.FlightFinder.OneWay_BTN)));
		Assert.assertEquals(driver.getTitle(),
				UrlTextUitls.TEXT.FlightFider_Page_Titel);
	}

	@Test(dependsOnMethods = "checkFlightFinderTitle", dataProvider = "Imrandata", dataProviderClass = FlightFinderProvider.class)
	// @Test(dataProvider = "Imrandata", dataProviderClass =
	// FlightFinderProvider.class)
	public void flightFinderTest(List<FlightFinderDTO> flightfinder) {
		System.out.println("Enter into Flight Finder  page");

		for (FlightFinderDTO Ffinder : flightfinder) {
			driver.findElement(By.xpath(XpathUtils.FlightFinder.OneWay_BTN))
					.click();

			// driver.findElement(By.xpath(XpathUtils.LoginModule.USER_NAME)).sendKeys(login.getUsername());
			driver.findElement(By.xpath(XpathUtils.FlightFinder.Passengers_BTN))
					.sendKeys(Ffinder.getPassengers());
			// passengers.selectByVisibleText("2 ");

			driver.findElement(By.xpath(XpathUtils.FlightFinder.Depart_BTN))
					.sendKeys(Ffinder.getDeparting());
			// depart.selectByVisibleText("San Francisco");

			driver.findElement(By.xpath(XpathUtils.FlightFinder.Month_BTN))
					.sendKeys(Ffinder.getMonth());
			// month.selectByVisibleText("May");

			driver.findElement(By.xpath(XpathUtils.FlightFinder.Day_BTN))
					.sendKeys(Ffinder.getDay());
			// day.selectByVisibleText("2");

			driver.findElement(By.xpath(XpathUtils.FlightFinder.Arrive_BTN))
					.sendKeys(Ffinder.getArriving());
			// arrive.selectByVisibleText("Paris");

			driver.findElement(By.xpath(XpathUtils.FlightFinder.Return_BTN))
					.sendKeys(Ffinder.getRmonth());
			// returns.selectByVisibleText("August");

			driver.findElement(By.xpath(XpathUtils.FlightFinder.RtDay_BTN))
					.sendKeys(Ffinder.getRday());
			// rtDay.selectByVisibleText("21");

			driver.findElement(By.xpath(XpathUtils.FlightFinder.Service_BTN))
					.click();

			driver.findElement(By.xpath(XpathUtils.FlightFinder.Airline_BTN))
					.sendKeys(Ffinder.getAirline());
			// airline.selectByVisibleText("Blue Skies Airlines"); s

			driver.findElement(By.xpath(XpathUtils.FlightFinder.Cont_BTN))
					.click();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Flight Founded Successfully");

		}

	}

}
