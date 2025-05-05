package day7_8042025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_logout_POM2_pagefact {
	
	WebDriver driver;
	public OrangeHRM_logout_POM2_pagefact(WebDriver idriver) {
	
		 driver=idriver;	
		 PageFactory.initElements(driver, this);
		 
	}

	//repository using by pagefactory
	
	//repository using factory
		@FindBy (name="username") WebElement usernm;
		@FindBy (className="oxd-userdropdown-tab") WebElement profile;
		@FindBy (xpath="//ul[@role='menu']/child::li[4]/child::a") WebElement logoutlink;
	
	
	
	
	public void clickonprofile() {
		profile.click();
	}
	
	public void clickonlogoutlink() {
		logoutlink.click();
	}
}
