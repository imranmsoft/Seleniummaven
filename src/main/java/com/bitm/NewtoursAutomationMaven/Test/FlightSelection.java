package com.bitm.NewtoursAutomationMaven.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.NewtoursAutomationMaven.Uitls.DriverManager;
import com.bitm.NewtoursAutomationMaven.Uitls.UrlTextUitls;
import com.bitm.NewtoursAutomationMaven.Uitls.XpathUtils;

public class FlightSelection {
	private WebDriver driver = null;

	@Test
	public void checkFlightSelectionPageTitle() {
		driver = DriverManager.fireFoxDriver;
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement element = wait.until(ExpectedConditions
				.elementToBeClickable(By
						.xpath(XpathUtils.FlightSelection.DPT_BTN)));
		Assert.assertEquals(driver.getTitle(),
				UrlTextUitls.TEXT.FlightSelection_Page_Title);
		System.out.println("Flight Selection Page verified ");

	}

	@Test(dependsOnMethods="checkFlightSelectionPageTitle")
	public void FlightSelectionTest() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		System.out.println("Selection Page");
		{
			driver.findElement(By.xpath(XpathUtils.FlightSelection.DPT_BTN))
					.click();
			driver.findElement(By.xpath(XpathUtils.FlightSelection.RT_BTN))
					.click();
			driver.findElement(By.xpath(XpathUtils.FlightSelection.CNT_BTN))
					.click();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Flight Selected Successfully");

		}

	}
}
