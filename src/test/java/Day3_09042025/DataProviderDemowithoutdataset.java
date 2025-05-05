package Day3_09042025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DataProviderDemowithoutdataset {
	WebDriver driver;
		
		@Test
		public void searchmobile() {
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement searchBox=driver.findElement(By.name("q"));
			searchBox.sendKeys("iphone 16");
			searchBox.sendKeys(Keys.ENTER);
			
		}


	

}
