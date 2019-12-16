import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class login33 extends TestBase {
	
	@Test
	public void ValidLogin () throws InterruptedException {
		
		driver.findElement(By.xpath(OR.getProperty("email33_XPATH"))).sendKeys(OR.getProperty("emailTxt33"));
		driver.findElement(By.xpath(OR.getProperty("password33_XPATH"))).sendKeys(OR.getProperty("passwordTxt33"));
		driver.findElement(By.xpath(OR.getProperty("loginBtn33_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("selectHospitalDropDown_XPATH"))).click();
		
		Select drpHospital = new Select(driver.findElement(By.getProperty("Hospital));"
	
	}
}
