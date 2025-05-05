package Selenium_interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableDatafetching {
	
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table=driver.findElement(By.id("customers"));
		
		List<WebElement> rows=table.findElements(By.xpath("//tbody/tr"));
		
		for(WebElement row:rows) {
			List<WebElement> cols=row.findElements(By.tagName("td"));
			
			for(WebElement col:cols) {
				System.out.print(col.getText()+"|");
				
			}
			System.out.println();
		}
		
		
	}

}
