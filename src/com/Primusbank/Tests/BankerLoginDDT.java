package com.Primusbank.Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Primjusbank.Library.BankerHomepage;
import com.Primjusbank.Library.PrimusbankHomePage;
import com.Primusbank.Constants.PrimusbankConstants;
import com.Utils.XLUtils;
 
public class BankerLoginDDT extends PrimusbankConstants{
	@Test
	public void bankerLoginTest() throws IOException
	{
	
	PrimusbankHomePage phome=new PrimusbankHomePage();
	BankerHomepage bhome=new BankerHomepage();
	
	
	String xlfile="C:\\Selenium demo\\Primusbank\\src\\com\\Primusbank\\Testdata\\dreamdata.xlsx";
	String xlsheet="LoginData";
	
	int rc;
	rc=XLUtils.getRowCount(xlfile, xlsheet);
	boolean res;
	
	for (int i = 1; i <= rc; i++) {
		
		phome.branchname=XLUtils.getCellData(xlfile, xlsheet, i, 0);
		phome.bankeruid=XLUtils.getCellData(xlfile, xlsheet, i, 1);
		phome.bankerpwd=XLUtils.getCellData(xlfile, xlsheet, i, 2);
		res=phome.bankerLogin(phome.branchname, phome.bankeruid, phome.bankerpwd);
		
		if (res) {
			XLUtils.setCellData(xlfile, xlsheet, i, 3, "pass");
			XLUtils.fillGreenColor(xlfile, xlsheet, i, 3);
			
		} else {
			XLUtils.setCellData(xlfile, xlsheet, i, 3, "fail");
			XLUtils.fillRedColor(xlfile, xlsheet, i, 3);

		}
		bhome.bakerLogout();
		
		
		
		
		
		
		
	}
		
	}
	


}
