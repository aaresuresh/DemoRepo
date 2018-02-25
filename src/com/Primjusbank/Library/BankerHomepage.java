package com.Primjusbank.Library;

import org.openqa.selenium.By;

import com.Primusbank.Constants.PrimusbankConstants;

public class BankerHomepage extends PrimusbankConstants {
	
	public void bakerLogout()
	{
		driver.findElement(By.xpath("//*[@id='IMG1' or @src='images/admin_but_03.jpg']")).click();
	}
}
