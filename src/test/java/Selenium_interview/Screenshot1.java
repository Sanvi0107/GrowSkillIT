package Selenium_interview;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?client=firefox-b-d&q=amazon+kurtis");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\Screenshots\\Amazon.png");
		FileHandler.copy(src, dest);
	}

}
