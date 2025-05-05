package day7_8042025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRM_logout_POM {
	
	WebDriver driver;
	public OrangeHRM_logout_POM(WebDriver driver) {
	
		 this.driver=driver;	
		 
	}

	//repository using by class
	By profile=By.className("oxd-userdropdown-tab");
	By logoutlink=By.xpath("//ul[@role='menu']/child::li[4]/child::a");
	
	
	
	public void clickonprofile() {
		driver.findElement(profile).click();
	}
	
	public void clickonlogoutlink() {
		driver.findElement(logoutlink).click();
	}
}
