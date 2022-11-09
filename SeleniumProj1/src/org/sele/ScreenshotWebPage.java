package org.sele;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotWebPage {
	public static void main(String[] args) throws AWTException, IOException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
//	Type Cast
		TakesScreenshot ts = (TakesScreenshot)driver;
	
//	To take Screenshot
		File src = ts.getScreenshotAs(OutputType.FILE);
		
//	Desired Location
		File des = new File("C:\\Users\\2047968\\eclipse-workspace\\SeleniumProj1\\SS\\pic1.png");
	
//	TO copy and Paste
		FileUtils.copyFile(src,des);
	
	}

}



