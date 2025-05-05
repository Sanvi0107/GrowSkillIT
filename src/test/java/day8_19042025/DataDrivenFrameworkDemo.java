package day8_19042025;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import day7_8042025.OrangeHRM_login_POM_pagefact;
import day7_8042025.OrangeHRM_logout_POM2_pagefact;

public class DataDrivenFrameworkDemo {
	@Test
	public void executeMethods() throws InterruptedException, IOException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		OrangeHRM_login_POM_pagefact lin=new OrangeHRM_login_POM_pagefact(driver);
		OrangeHRM_logout_POM2_pagefact linn=new OrangeHRM_logout_POM2_pagefact(driver);
		
		lin.url();
		
		String filepath="C:\\Users\\ADMIN\\Desktop\\TestingDataKeyword.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Data");
		
		int rows=sheet.getLastRowNum();
		System.out.println("Total no of rows:" +rows);
		
		for(int i=1;i<=rows;i++) {
			XSSFRow row=sheet.getRow(i);
			XSSFCell usernm=row.getCell(0);
			XSSFCell pass=row.getCell(1);
			
			System.out.println("Username___"+ usernm+       "Password_____"+pass);
			try {
			lin.enterusername(usernm.toString());
			lin.enterpass(pass.toString());
			lin.clickonlogin();
			linn.clickonprofile();
			linn.clickonlogoutlink();
			System.out.println("Valid Data");
		}
			catch(Exception e) {
				System.out.println("Invalid data");
			}
		
		fis.close();
		
     }
		}
}
