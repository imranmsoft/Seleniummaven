package com.bitm.AutomationMaven.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.bitm.NewtoursAutomationMaven.Uitls.ExcelUtils;

public class FlightBookingDataProvider {

	@DataProvider(name="ImranBookdata")
	public static Object [][] getFlightBookingData(){
		try {
			return new Object[][]{
					{
						ExcelUtils.getFlightBookingData()
					},
				};
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
}

