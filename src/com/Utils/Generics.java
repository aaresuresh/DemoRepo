package com.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Generics {
	
	public static void selectItem(WebDriver driver,String locator,String item)
	
	{
		Select list=new Select(driver.findElement(By.xpath(locator)));
		list.selectByVisibleText(item);
	}

}
