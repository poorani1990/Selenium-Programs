package org.junit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFile {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
//Poorani	//XSSFWorkbook work = new XSSFWorkbook();
		
		
		driver.manage().window().maximize();
		//XSSFWorkbook work = new XSSFWorkbook();
	}
}