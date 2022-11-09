package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathwithPosition {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\chromedriver_win32\\\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		WebElement chk = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		chk.click();
		
		driver.close();
		
		
		
		
	}

}
