package com.w2a.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class SaleLogin extends TestBase{
	
	
	@Test
	public void LoginAsSale() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(OR.getProperty("salesEmail_XPATH"))).sendKeys(OR.getProperty("salesText"));
		
		driver.findElement(By.xpath(OR.getProperty("pass_XPATH"))).sendKeys(OR.getProperty("passText"));
		
		click("SignInBtn_XPATH");
		
		//Verify User sees Sales on Dashboard
		String actualDashView = driver.findElement(By.xpath(OR.getProperty("sales_XPATH"))).getText();
		String expectedDashView = "Sales";
		
		Assert.assertEquals(actualDashView, expectedDashView,"The Actual and Expected Dash is not a match");
		
	}

}
