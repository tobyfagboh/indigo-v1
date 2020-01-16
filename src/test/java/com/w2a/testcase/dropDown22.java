package com.w2a.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class dropDown22 extends TestBase {
	
	@Test
	public void InvalidLogin () throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("email22_XPATH"))).sendKeys(OR.getProperty("emailTxt07"));
		driver.findElement(By.xpath(OR.getProperty("password22_XPATH"))).sendKeys(OR.getProperty("passwordTxt07"));
		driver.findElement(By.xpath(OR.getProperty("loginBtn22_XPATH"))).click();	
		driver.findElement(By.xpath(OR.getProperty("DropDownBtn_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("Type2Hosp_XPATH"))).click();
		Thread.sleep(3000);
	}
}
