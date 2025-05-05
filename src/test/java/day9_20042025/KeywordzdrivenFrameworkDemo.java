package day9_20042025;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import day7_8042025.OrangeHRM_login_POM_pagefact;
import day7_8042025.OrangeHRM_logout_POM2_pagefact;

public class KeywordzdrivenFrameworkDemo {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		OrangeHRM_login_POM_pagefact lin=new OrangeHRM_login_POM_pagefact(driver);
		OrangeHRM_logout_POM2_pagefact linn=new OrangeHRM_logout_POM2_pagefact(driver);
		
		String filepath="C:\\Users\\ADMIN\\Desktop\\TestingDataKeyword.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Keyword");
		
		int rows=sheet.getLastRowNum();
		System.out.println("Total no of rows:" +rows);
		for(int i=1;i<=rows;i++) {
			XSSFRow row=sheet.getRow(i);
			//XSSFCell usernm=row.getCell(0);
			XSSFCell key=row.getCell(1);
			
			System.out.println("keywords___"+key)	;
		switch(key.toString()) {
		
		case "url":
			lin.url();
			System.out.println("url match");
			break;
			
		case "enterUserName":
			lin.enterusername("Admin");
			System.out.println("username match");
			break;
			
		case "enterPassword":
			lin.enterpass("admin123");
			System.out.println("password match");
			break;	
			
		case "ClickonLoginBtn":
			lin.clickonlogin();
			System.out.println("login match");
			break;	
	    		
		case "ClickonProfile":
			linn.clickonprofile();
			System.out.println("profile match");
			break;
			
		case "ClickonLogoutLink":
			linn.clickonlogoutlink();
			System.out.println("logout match");
			break;
			
		default: System.out.println("invalid keyword");
		
		}
			
		}
		fis.close();
			
	}

}
