package com.Primjusbank.Library;

import org.openqa.selenium.By;

import com.Primusbank.Constants.PrimusbankConstants;

public class AdminHomePage extends PrimusbankConstants {
	
	public void adminLogout()
	{
		driver.findElement(By.linkText("Not Now")).click();
		driver.findElement(By.id("userNavigationLabel")).click();
		driver.findElement(By.partialLinkText("Log Out")).click();
	}
			
	
	
	

}
