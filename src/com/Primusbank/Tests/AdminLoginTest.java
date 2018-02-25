package com.Primusbank.Tests;



import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Primjusbank.Library.AdminHomePage;
import com.Primjusbank.Library.PrimusbankHomePage;
import com.Primusbank.Constants.PrimusbankConstants;

public class AdminLoginTest extends PrimusbankConstants {

         @Test
         public void adminLogin() throws InterruptedException
         {

		     boolean res;
		     PrimusbankHomePage phome=new PrimusbankHomePage();
		     phome.adminuid="aaresureshnaidu@gmail.com";
		     phome.adminpwd="lordparamasiva";
             res=phome.adminLogin(phome.adminuid, phome.adminpwd);
		     Assert.assertTrue(res);
		
		     AdminHomePage ahome=new AdminHomePage();
		     ahome.adminLogout();
		
		

	}
	
	}



