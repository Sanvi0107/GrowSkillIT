package Selenium_interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehoveractions {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Actions action=new Actions(driver);
		Thread.sleep(1000);
		
		WebElement menu=driver.findElement(By.className("oxd-main-menu-item"));
		
		action.moveToElement(menu).perform();
		
		
		
	}

}
