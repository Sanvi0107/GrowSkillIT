package day7_8042025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_login_POM_pagefact {
	
	WebDriver driver;
	
	public OrangeHRM_login_POM_pagefact(WebDriver idriver) {
	
		 driver=idriver;	
		 PageFactory.initElements(driver, this);
		 
	}

	//repository using factory
	@FindBy (name="username") WebElement usernm;
	@FindBy (name="password") WebElement pass;
	@FindBy (xpath="//button[@type='submit']") WebElement loginBth;
	
	
	public void url() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	/*public void enterusername() {
		driver.findElement(usernm).sendKeys("Admin");
	}
	
	public void enterpass() {
		driver.findElement(pass).sendKeys("admin123");
	}*/
	
	public void enterusername(String um) {
		usernm.sendKeys(um);
	}
	
	public void enterpass(String pass1) {
		pass.sendKeys(pass1);
	}
	
	public void clickonlogin() throws InterruptedException {
		loginBth.click();
		Thread.sleep(5000);
	}
}
