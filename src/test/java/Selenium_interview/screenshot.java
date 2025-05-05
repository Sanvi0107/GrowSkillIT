package Selenium_interview;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/women-kurtas-kurtis-suits");
		Thread.sleep(2000);
		 
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\Screenshots\\loginpage.png");
		FileHandler.copy(src, dest);
		
	}
}
