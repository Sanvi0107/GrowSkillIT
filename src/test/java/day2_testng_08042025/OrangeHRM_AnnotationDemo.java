package day2_testng_08042025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrangeHRM_AnnotationDemo {
	WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	@Test(priority=1)
	public void login() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
			
	}
	
	@Test(priority=2)
	public void verifyHomePage() {
		String dash=driver.findElement(By.xpath("//div[@id='app']/descendant::h6")).getText();
		Assert.assertEquals(dash, "Dasboard");
		/*if(dash.equals("Dasboard")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test Case fail");
		}*/
	}
	
	@Test(priority=3)
	public void logout() throws InterruptedException {
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		driver.findElement(By.xpath("//ul[@role='menu']/child::li[4]/child::a")).click();
		Thread.sleep(5000);
	}
	
	@AfterSuite
	public void Teardown() {
		driver.quit();
	}
}
