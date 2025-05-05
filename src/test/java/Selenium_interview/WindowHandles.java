package Selenium_interview;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/tops");
		
		String mainwindow=driver.getWindowHandle();
		
		List<WebElement> links=driver.findElements(By.xpath("//ul[@class='results-base']/child::li/child::a"));
		
     System.out.println("SIze of list is"+ links.size());
     
     for(int i=0;i<7;i++) {
    	 links.get(i).click();
    	 Thread.sleep(2000);
    	 
     }
         //System.out.println(driver.getTitle());
		String expectedtitle="Buy Slenor Floral Print Georgette Peplum Top - Tops for Women 28090622 | Myntra";
		
		Set<String> allwindows=driver.getWindowHandles();
		//System.out.println(allwindows);
		
		for(String window:allwindows) {
			
			driver.switchTo().window(window);
			String title=driver.getTitle();
			System.out.println(title);
			
			if(driver.getTitle().equalsIgnoreCase(expectedtitle)) {
			System.out.println("Window switch to expected title");
			break;
		}}

	}

}
