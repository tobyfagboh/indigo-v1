package com.w2a.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class Login07 extends TestBase {

	@Test
	public void InvalidLogin () throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("email07_XPATH"))).sendKeys(OR.getProperty("emailTxt07"));
		driver.findElement(By.xpath(OR.getProperty("password07_XPATH"))).sendKeys(OR.getProperty("passwordTxt07"));
		driver.findElement(By.xpath(OR.getProperty("loginBtn07_XPATH"))).click();
		Thread.sleep(3000);

	}
}
