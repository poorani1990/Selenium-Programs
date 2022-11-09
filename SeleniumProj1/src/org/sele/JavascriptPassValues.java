package org.sele;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavascriptPassValues {
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtUser = driver.findElement(By.id("email"));	
	
//	Type cast
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
//	To enter the value by java script
		executor.executeScript("arguments[0].setAtttribute('value','Greens')", txtUser);
		
//	To get the value passed by the user using java script
		Object txt1 = executor.executeScript("return arguments[0].getAttribute('value')", txtUser);
		System.out.println(txt1);
		
		 WebElement pwd = driver.findElement(By.id("pass"));
		 executor.executeScript("arguments[0].setAttribute('value','pwd@123')", pwd);
		 
		 Object txt2 = executor.executeScript("return arguments[0].getAttribute('value')", pwd);
		 System.out.println(txt2);
		 
		 WebElement btn = driver.findElement(By.name("login"));
		 
		 executor.executeScript("arguments[0].click()",btn);
		 
	
	}

}

