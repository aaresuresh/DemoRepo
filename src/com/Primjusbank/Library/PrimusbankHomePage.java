package com.Primjusbank.Library;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Primusbank.Constants.PrimusbankConstants;

public class PrimusbankHomePage extends PrimusbankConstants {
	
	 public String adminuid;
	 public String adminpwd;
	 public String branchname,bankeruid,bankerpwd;
	 
	 
	  public boolean adminLogin(String uid, String pwd) throws InterruptedException 
	 {
		 String expurl,acturl;
		 expurl="facebook";
		 driver.findElement(By.id("email")).sendKeys(uid);
		 driver.findElement(By.id("pass")).sendKeys(pwd);
		 Thread.sleep(3000);
		 driver.findElement(By.id("u_0_2")).click();
		 acturl=driver.getCurrentUrl();
		 if(acturl.toLowerCase().contains(expurl.toLowerCase()))
		 {
			 return true;
			 
		 }else
		 {
			 return false;
		 }
	 }

		
	
					
	 public boolean bankerLogin(String brname, String uid, String pwd)
	 {
		 String expurl,acturl;
		 expurl="bankerflow";
		 Select list=new Select(driver.findElement(By.id("drlist")));
		 list.selectByVisibleText(brname);
		 driver.findElement(By.id("txtuId")).sendKeys(uid);
		 driver.findElement(By.id("txtPword")).sendKeys(pwd);

		 driver.findElement(By.name("login")).click();

		 acturl=driver.getCurrentUrl();
		 if(acturl.toLowerCase().contains(expurl.toLowerCase()))
		 {
			 return true;
		 }else
		 {
			 return false;
		 }
	
		 
		 
	 }
			 
			 
	
		 
		 
		
	 }
	 

