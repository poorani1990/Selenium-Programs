package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathwithTextnContains {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

//	Locating with Text
		WebElement text = driver.findElement(By.xpath("//a[text()= 'Create a Page']"));
		text.click();

//	Partial Text
		WebElement txt = driver.findElement(By.xpath("//a[contains(text(),'Create a')]"));
		txt.click();

//	Partial Attribute
		WebElement att = driver.findElement(By.xpath("//a[contains(@class,'_8')]"));
		att.click();

// 	getText() -> Used to print the existing text from the webpage

		WebElement gettxt = driver.findElement(By.xpath("//a[contains(@class,'_8')]"));

		String text2 = gettxt.getText();
		System.out.println("text2");

		gettxt.click();

// getAttribute() -> Used to print the value passed by the user

		WebElement txtUser = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		txtUser.sendKeys("greens");
		
		String att1 = txtUser.getAttribute("value");
		System.out.println("att1");
	}

}
