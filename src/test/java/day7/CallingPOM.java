package day7;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import day7_8042025.OrangeHRM_login_POM_pagefact;
import day7_8042025.OrangeHRM_logout_POM2_pagefact;

public class CallingPOM {

	@Test
	public void executeMethods() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		OrangeHRM_login_POM_pagefact lin=new OrangeHRM_login_POM_pagefact(driver);
		OrangeHRM_logout_POM2_pagefact linn=new OrangeHRM_logout_POM2_pagefact(driver);
		
		lin.url();
		lin.enterusername("Admin");
		lin.enterpass("admin123");
		lin.clickonlogin();
		linn.clickonprofile();
		linn.clickonlogoutlink();
	}
	
}
