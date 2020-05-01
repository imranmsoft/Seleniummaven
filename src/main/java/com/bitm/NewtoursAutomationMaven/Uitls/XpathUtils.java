package com.bitm.NewtoursAutomationMaven.Uitls;

public class XpathUtils {
	
public class LoginModule{
	public static final String USER_NAME="//input[@name='userName']";
	
	public static final String PASWORD="//input[@name='password']";
	
	public static final String SIGN_IN_BTN="//input[@name='login']";
			
}

public class FlightFinder{
	public static final String OneWay_BTN="//body//b//input[2]";
	
   	// public static final String OneWay_BTN = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]";	
      public static final String Passengers_BTN = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select";
   	 public static final String Depart_BTN= "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select";
        public static final String Month_BTN = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[1]";
        public static final String Day_BTN= "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[2]";
        public static final String Arrive_BTN= "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select";
        public static final String Return_BTN = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[1]";
        public static final String RtDay_BTN= "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[2]";
        public static final String Service_BTN = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]";
        public static final String Airline_BTN= "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select";
        public static final String Cont_BTN = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input";
   
   
   }

	public class FlightSelection{
    	
    	public static final String DPT_BTN = "//table//table//table//table//table[1]//tbody[1]//tr[5]//td[1]//input[1]";
    	
    	public static final String RT_BTN= "//table[2]//tbody[1]//tr[5]//td[1]//input[1]";
    	
    	public static final String CNT_BTN = "//input[@name='reserveFlights']";
    
        
     }
	
	public class FlightBook{
		//input[@name='passLast0']
		public static final String fname="//input[@name='passFirst*']";
		public static final String lname="//input[@name='passLast*']";
		public static final String meal="//select[@name='pass.*.meal']";
		
		//public static final String meal1="//select[@name='pass.1.meal']//option[contains(text(),'Kosher')]";
		public static final String CCARD_SLOT= "//select[@name='creditCard']";
    	public static final String CARD_NUMBER= "//input[@name='creditnumber']";
    	public static final String EDATE_SLOT= "//select[@name='cc_exp_dt_mn']";
    	public static final String EYEAR_SLOT= "//select[@name='cc_exp_dt_yr']";
    	public static final String FRSTNAME_SLOT= "//input[@name='cc_frst_name']";
    	public static final String MIDNAME_SLOT= "//input[@name='cc_mid_name']";
    	public static final String LASTNAME_SLOT= "//input[@name='cc_last_name']";
    	public static final String TICKETLESS_BTN= "//tr[9]//td[2]//input[1]";
    	public static final String BILLADD_SLOT= "//input[@name='billAddress1']";
    	public static final String BILLCITY_SLOT= "//input[@name='billCity']";
    	public static final String BILLSTATE_SLOT= "//input[@name='billState']";
    	public static final String BILLPOST_SLOT= "//input[@name='billZip']";
    	public static final String BILLCOUNTRY_SLOT= "//select[@name='billCountry']";
    	public static final String BILLING_BTN= "//tr[15]//td[2]//input[1]";
    	public static final String DELADD_SLOT= "//input[@name='delAddress1']";
    	public static final String DELCITY_SLOT= "//input[@name='delCity']";
    	public static final String DELSTATE_SLOT= "//input[@name='delState']";
    	public static final String DELPOST_SLOT= "//input[@name='delZip']";
    	public static final String DELCOUNTRY_SLOT= "//select[@name='delCountry']//option[contains(text(),'BANGLADESH')]";
    	
    	
	}
}
	


