package org.sele;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
//	WebDriver -> Interface
//	driver --> ObjRef
//	new --> Keyword
//	ChromeDriver --> Predefined class
		
// 	Launch URL
		driver.get("https://www.facebook.com/");
		
//	To Maximize
		driver.manage().window().maximize();
		
//	To find the locator
		WebElement txtUser = driver.findElement(By.id("email"));
		
//	To enter the values
		txtUser.sendKeys("pooraninayaki");
		
//	To find the locator for pwd field and enter values
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("India@123");
		
//	To click on login button
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();
		
//		driver.close();
		
		
	}
}
