package day7_8042025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRM_login_POM {
	
	WebDriver driver;
	public OrangeHRM_login_POM(WebDriver driver) {
	
		 this.driver=driver;	
		 
	}

	//repository using by class
	By usernm=By.name("username");
	By pass=By.name("password");
	By loginBth=By.xpath("//button[@type='submit']");
	
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
		driver.findElement(usernm).sendKeys(um);
	}
	
	public void enterpass(String pass1) {
		driver.findElement(pass).sendKeys(pass1);
	}
	
	public void clickonlogin() throws InterruptedException {
		driver.findElement(loginBth).click();
		Thread.sleep(5000);
	}
}
