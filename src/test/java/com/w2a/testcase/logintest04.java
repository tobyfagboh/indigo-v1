package com.w2a.testcase;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class logintest04 extends TestBase {

	@Test
	public void validlogin () {
		
		driver.findElement(By.xpath(OR.getProperty("email04_XPATH"))).sendKeys(OR.getProperty("emailTxt04"));
		driver.findElement(By.xpath(OR.getProperty("password04_XPATH"))).sendKeys(OR.getProperty("passwordTxt04"));
		driver.findElement(By.xpath(OR.getProperty("loginBtn04_XPATH"))).click();
		
	
	}
	
		
}