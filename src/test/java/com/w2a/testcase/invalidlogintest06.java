package com.w2a.testcase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class invalidlogintest06 extends TestBase {

	@Test
	public void invalidlogin ()  {
		
		driver.findElement(By.xpath(OR.getProperty("email06_XPATH"))).sendKeys(OR.getProperty("emailTxt06"));
		driver.findElement(By.xpath(OR.getProperty("password06_XPATH"))).sendKeys(OR.getProperty("passwordTxt06"));
		driver.findElement(By.xpath(OR.getProperty("loginBtn06_XPATH"))).click();
		
		
			}
	
		
}