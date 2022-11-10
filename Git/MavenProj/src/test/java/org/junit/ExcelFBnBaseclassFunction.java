package org.junit;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelFBnBaseclassFunction extends ExcelFBnBaseclass {

	public static final String getDataFromExcel = null;
	
	public static void main(String[] args) throws IOException, InterruptedException {
				
		ExcelFBnBaseclassFunction b = new ExcelFBnBaseclassFunction();
			b.browserLaunch("https://www.facebook.com/");
			
			WebElement findUserName = b.findUserName("email");
			String dataFromExcel = b.getDataFromExcel("C:\\Users\\2047968\\eclipse-workspace\\MavenProj\\src\\test\\resources\\Test.xlsx",
					"sheet1",2,2);
			b.sendValues(findUserName, dataFromExcel);
			b.getValues(findUserName, dataFromExcel);
			b.clear(findUserName);
			String dataFromExcel1 = b.getDataFromExcel("C:\\Users\\2047968\\eclipse-workspace\\MavenProj\\src\\test\\resources\\Test.xlsx",
					"sheet1",1,2);
			b.sendValues(findUserName, dataFromExcel1);
			WebElement findPassword = b.findPassword("pass");
			String dataFromExcel2 = b.getDataFromExcel("C:\\Users\\2047968\\eclipse-workspace\\MavenProj\\src\\test\\resources\\Test.xlsx",
					"sheet1",2,1);
			b.sendValues(findPassword, dataFromExcel2);
			WebElement word = b.findText("//a[contains(@class,'_8')]");
			WebElement newAccount = b.newAccount("(//a[@role ='button'])[2]");
			b.click(newAccount);
			Thread.sleep(3000);
	
			WebElement date = b.chooseDate("day");
			b.clickDate(date);
			b.multiple(date);
			b.selectDate(date);
//			WebElement name = b.textName("firstname");
	//		b.NameValue(name, "Poorani");
			WebElement genderSelected = b.selectGender("//label[text()='Male']");
			b.clickGender(genderSelected);
			Thread.sleep(3000);
			b.checkSelected("//label[text()='Male']");
			
			//Screenshot
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\2047968\\eclipse-workspace\\MavenProj\\src\\test\\resources\\SS\\pic1.png");
			FileUtils.copyFile(src,des);
			
		}

}
	


