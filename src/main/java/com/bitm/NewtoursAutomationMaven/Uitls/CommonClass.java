package com.bitm.NewtoursAutomationMaven.Uitls;

public class CommonClass {
	public static String getRandomString(int n) 
    { 
        
        String STOCK_STRING = "abcdefghijklmnopqrstuvxyz"
                                    + "0123456789";

                                  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
        for (int i = 0; i < n; i++) { 
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index = (int)(STOCK_STRING.length() * Math.random()); 
            // add Character one by one in end of sb 
            sb.append(STOCK_STRING.charAt(index)); 
        }   
        return sb.toString(); 
    }

	//Method call
	String str = getRandomString(6)+"@gmail.com";
}
