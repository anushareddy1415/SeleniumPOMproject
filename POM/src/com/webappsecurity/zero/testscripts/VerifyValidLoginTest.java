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
import com.webappsecurity.zero.pages.Login;

public class VerifyValidLoginTest extends Base {
	

	
	@Test
	public void verifylogin() {
		Login lI = new Login(driver);
		AccSummary As = new AccSummary(driver);
		
		lI.Acclogin("username", "password");
		boolean transferfundsvisible = As.istransferfundsvisible();
		Assert.assertTrue(transferfundsvisible);
		
		
	}
	
	
	
	
	

	
	
	
	
}