package day10_22042025;

import java.io.FileInputStream;
import java.io.FileOutputStream;
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

public class HybridFramework {	

@Test
public void executeMethod() throws IOException, InterruptedException{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	OrangeHRM_login_POM_pagefact lin=new OrangeHRM_login_POM_pagefact(driver);
	OrangeHRM_logout_POM2_pagefact linn=new OrangeHRM_logout_POM2_pagefact(driver);
	
	
	
	String filepath="C:\\Users\\ADMIN\\Desktop\\TestingDataKeyword.xlsx";
	FileInputStream fis=new FileInputStream(filepath);
	
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet datasheet=workbook.getSheet("Data");
	XSSFSheet keysheet=workbook.getSheet("Keyword");
	
	int drows=datasheet.getLastRowNum();
	System.out.println("Total no of data rows:" +drows);
	
	int krows=keysheet.getLastRowNum();
	System.out.println("Total no of key rows:" +krows);
	
	for(int dr=1;dr<=drows;dr++) {
		XSSFRow drow=datasheet.getRow(dr);
		XSSFCell usernm=drow.getCell(0);
		XSSFCell pass=drow.getCell(1);
		XSSFCell Result=drow.createCell(2);
		
		System.out.println("Username___"+ usernm+       "Password_____"+pass);
		try {
		for(int kr=1;kr<=krows;kr++) {
			XSSFRow krow=keysheet.getRow(kr);
			//XSSFCell usernm=row.getCell(0);
			XSSFCell key=krow.getCell(1);
			XSSFCell match=krow.createCell(2);
			System.out.println("keywords---> " + key);
			
			switch(key.toString()) {
			
			case "url":
				lin.url();
				System.out.println("url match");
				match.setCellValue("Url keyword is Matched");
				break;
				
			case "enterUserName":
				lin.enterusername(usernm.toString());
				System.out.println("username match");
				match.setCellValue("username keyword is Matched");
				break;
				
			case "enterPassword":
				lin.enterpass(pass.toString());
				System.out.println("password match");
				match.setCellValue("password keyword is Matched");
				break;	
				
			case "ClickonLoginBtn":
				lin.clickonlogin();
				System.out.println("login match");
				match.setCellValue("login keyword is Matched");
				break;	
		    		
			case "Clickonprofile":
				linn.clickonprofile();
				System.out.println("profile match");
				match.setCellValue("profile keyword is Matched");
				break;
				
			case "ClickonLogoutLink":
				linn.clickonlogoutlink();
				System.out.println("logout match");
				match.setCellValue("logout keyword is Matched");
				break;
				
			default: System.out.println("invalid keyword");
			
			}
				
		}
		System.out.println("valid data");
		Result.setCellValue("Valid Data");
		}
		catch(Exception e) {
			System.out.println("Invalid data");
			Result.setCellValue("Invalid Data");
		}
		
		fis.close();
		FileOutputStream fos=new FileOutputStream(filepath);
		workbook.write(fos);
                 }
         }
}

