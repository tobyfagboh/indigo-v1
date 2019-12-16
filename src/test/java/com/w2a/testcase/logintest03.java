package com.w2a.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class logintest03 extends TestBase {
	@Test
	public void ValidLogin () {
	
	driver.findElement(By.xpath(OR.getProperty("email03_XPATH"))).sendKeys(OR.getProperty("emailTxt03"));
	driver.findElement(By.xpath(OR.getProperty("password03_XPATH"))).sendKeys(OR.getProperty("passwordTxt03"));
	driver.findElement(By.xpath(OR.getProperty("loginBtn03_XPATH"))).click();
	
	

	
	}


}