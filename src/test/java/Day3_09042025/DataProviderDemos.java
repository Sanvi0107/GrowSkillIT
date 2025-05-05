package Day3_09042025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemos {
	WebDriver driver;
	@BeforeSuite()
	public void setUp() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	@DataProvider(name="dataSet")
	public Object[][] mobileDataSet(){
		Object[][] data=new Object[3][2];
		data[0][0]="Oppo";
		data[0][1]="Reno 13";
		
		data[1][0]="OnePlus";
		data[1][1]="11R";
		
		data[2][0]="IPhone";
		data[2][1]="16";
		
		
		return data;
	}
	
@Test(dataProvider= "dataSet")
		public void searchmobile(String brand, String model) {
			
			WebElement searchBox=driver.findElement(By.name("q"));
			searchBox.sendKeys(brand+" "+model);
			searchBox.sendKeys(Keys.ENTER);
			//driver.navigate().back();
			searchBox.clear();			
		}

}
	


