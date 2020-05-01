package com.bitm.NewtoursAutomationMaven.Test;

import java.util.List;

import javax.activity.InvalidActivityException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bitm.AutomationMaven.DTO.LoginDTO;
import com.bitm.AutomationMaven.DataProvider.LoginDataProvider;
import com.bitm.NewtoursAutomationMaven.Uitls.DriverManager;
import com.bitm.NewtoursAutomationMaven.Uitls.ExcelUtils;
import com.bitm.NewtoursAutomationMaven.Uitls.UrlTextUitls;
import com.bitm.NewtoursAutomationMaven.Uitls.XpathUtils;


public class LoginTest {

	private WebDriver driver = null;

	@Test
	public void checkloginpageTitle() {
		// title functionality
		driver = DriverManager.fireFoxDriver;
		driver.get(UrlTextUitls.Url.BASE_URL);
		System.out.println("Applicaiton is opening");
		// asert equals na pile oi jaigai stop running execution
		

		 Assert.assertEquals(driver.getTitle(),
		 UrlTextUitls.TEXT.Login_Page_Title);
		 System.out.println("Login Page title Verified");

	}

	
	@Test(dependsOnMethods = "checkloginpageTitle", dataProvider = "loginData", dataProviderClass = LoginDataProvider.class)
	public void loginTest(List<LoginDTO> logindata)  {
		System.out.println("Enter into login page");

		for (LoginDTO login : logindata) {

			

			// login functioanlity

			WebDriverWait wait = new WebDriverWait(driver, 20);
			// WebElement usrnam = driver.findElement(By.xpath("USER_NAME"));
			// Thread.sleep(10000);
			System.out.println("Enter User Name");
			driver.findElement(By.xpath(XpathUtils.LoginModule.USER_NAME))
					.sendKeys(login.getUsername());
			
			System.out.println("password:: "+login.getPassword());
			driver.findElement(By.xpath(XpathUtils.LoginModule.PASWORD))
					.sendKeys(login.getPassword());
			System.out.println("Enter Passowrd");
			// Thread.sleep(10000);
			driver.findElement(By.xpath(XpathUtils.LoginModule.SIGN_IN_BTN))
					.click();
			System.out.println("Sign butotn click");
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}
	}
}
