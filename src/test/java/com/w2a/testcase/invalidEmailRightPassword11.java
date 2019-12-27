package com.w2a.testcase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class invalidEmailRightPassword11 extends TestBase {

	@Test
	public void invalidlogin ()  {
		
		driver.findElement(By.xpath(OR.getProperty("email11_XPATH"))).sendKeys(OR.getProperty("emailTxt11"));
		driver.findElement(By.xpath(OR.getProperty("password11_XPATH"))).sendKeys(OR.getProperty("passwordTxt11"));
		driver.findElement(By.xpath(OR.getProperty("loginBtn11_XPATH"))).click();
		
		
			}
	
		
}