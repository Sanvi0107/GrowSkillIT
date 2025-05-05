package Selenium_interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uploadfile {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("My Info")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--text']")).click();
		//driver.findElement(By.xpath("//div[@class='oxd-file-button']")).click();
		
		//driver.findElement(By.name("Browse")).click();
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
		fileInput.sendKeys("F:\\Screenshots\\abcd.txt");
		
	}
}
