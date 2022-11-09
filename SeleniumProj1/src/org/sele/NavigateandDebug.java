package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateandDebug {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.facebook.com/");

		driver.manage().window().maximize();

//		Locating with Text
		WebElement text = driver.findElement(By.xpath("//a[text()= 'Create a Page']"));
		text.click();

//		to go back
		driver.navigate().back();

//		To go forward
		driver.navigate().forward();
		
		Thread.sleep(3000);

//		To find the locator
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("pooraninayaki");

//		To find the locator for pwd field and enter values
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("India@123");

//		To refresh 
		driver.navigate().refresh();

	}

}
