package com.Primusbank.Tests;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Primjusbank.Library.BankerHomepage;
import com.Primjusbank.Library.PrimusbankHomePage;
import com.Primusbank.Constants.PrimusbankConstants;

public class BankerLoginTest extends PrimusbankConstants {
	@Test
	public void bankerTest()
	{
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		boolean res;
		PrimusbankHomePage phome=new PrimusbankHomePage();
		phome.branchname="Bal";
		phome.bankeruid="demo";
		phome.bankerpwd="demo";
		res=phome.bankerLogin(phome.branchname, phome.bankeruid, phome.bankerpwd);
	    Assert.assertTrue(res);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//BankerHomepage bhome=new BankerHomepage();
		//bhome.bakerLogout();
		
		
	}

}

