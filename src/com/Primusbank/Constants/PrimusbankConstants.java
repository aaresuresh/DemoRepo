package com.Primusbank.Constants;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class PrimusbankConstants {
	
  

	
	public static WebDriver driver;
	
	 public static String url= "https://www.facebook.com/";
	 

	 
	 
	 
	 
	 @BeforeTest
	 public static void launchAPP()
	 {
		 driver=new FirefoxDriver();
		 driver.manage().deleteAllCookies();
	     driver.get(url);
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


		 
	 }
	 
	 public static void closeApp()
	 {
		 driver.close();
	 }


}


