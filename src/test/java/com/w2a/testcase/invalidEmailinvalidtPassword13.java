package com.w2a.testcase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class invalidEmailinvalidtPassword13 extends TestBase {

	@Test
	public void invalidlogin ()  {
		
		driver.findElement(By.xpath(OR.getProperty("email13_XPATH"))).sendKeys(OR.getProperty("emailTxt13"));
		driver.findElement(By.xpath(OR.getProperty("password13_XPATH"))).sendKeys(OR.getProperty("passwordTxt13"));
		driver.findElement(By.xpath(OR.getProperty("loginBtn13_XPATH"))).click();
		
		
			}
	
		
}