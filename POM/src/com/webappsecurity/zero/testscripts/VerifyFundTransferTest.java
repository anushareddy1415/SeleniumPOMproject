package com.webappsecurity.zero.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webappsecurity.zero.pages.AccSummary;
import com.webappsecurity.zero.pages.ConfirmTransfer;
import com.webappsecurity.zero.pages.Login;
import com.webappsecurity.zero.pages.TransferFunds;
import com.webappsecurity.zero.pages.VerifyTransferFunds;

public class VerifyFundTransferTest extends Base{
	

	@Test
	public void VerifyFundTransfer() {
		Login lI = new Login(driver);
		AccSummary As = new AccSummary(driver);
		TransferFunds Tf = new TransferFunds(driver);
		VerifyTransferFunds Vtf = new VerifyTransferFunds(driver);
		ConfirmTransfer Ct = new ConfirmTransfer(driver);
		
		lI.Acclogin("username", "password");
		As.clicktranferfunds();
		Tf.TransferingFunds("200", "fund transfer of 200");
		Vtf.clicksubmitbtn();
		String actualtext = Ct.getconfirmmsg();
		String expectedtext = "You successfully submitted your transaction.";
		Assert.assertEquals(actualtext, expectedtext);
	
	}
	
}
