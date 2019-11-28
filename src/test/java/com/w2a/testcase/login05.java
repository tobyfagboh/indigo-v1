package com.w2a.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class login05 extends TestBase {
 
	@Test
	public void ValidLogin () {
		
		driver.findElement(By.xpath(OR.getProperty("email05_XPATH"))).sendKeys(OR.getProperty("emailTxt05"));
		driver.findElement(By.xpath(OR.getProperty("password05_XPATH"))).sendKeys(OR.getProperty("passwordTxt05"));
		driver.findElement(By.xpath(OR.getProperty("loginBtn05_XPATH"))).click();
		
		
		
		
		
	}
}