package org.junit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFile {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		//XSSFWorkbook work = new XSSFWorkbook();

		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Poorani");
		

		WebElement pwd= driver.findElement(By.name("pass"));
		username.sendKeys("Poorani@123");
		
	}
}
