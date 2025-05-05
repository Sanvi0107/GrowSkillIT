package day6_15042025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossbrowserTestDemo {
	WebDriver driver=null;
	@Parameters("Browser")
	@Test
	
	public void launchBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) {
			driver=new InternetExplorerDriver();
		}
	}
	
	@Test
	public void app() {
		driver.get("https://www.facebook.com/");
	}

}

