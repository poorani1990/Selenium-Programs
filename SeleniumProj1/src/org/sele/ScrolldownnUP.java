package org.sele;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrolldownnUP {
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement down = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));	
	
//	Type cast
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
//	To scroll down
		executor.executeScript("arguments[0].scrollIntoView(true);", down);
		Thread.sleep(3000);
		
		WebElement up = driver.findElement(By.xpath("//span[text()='Best Sellers in Computers & Accessories']"));
	
//	Scroll up
		executor.executeScript("arguments[0].scrollIntoView(false);", up);
		
//	Scroll up
		WebElement up2 = driver.findElement(By.xpath("//h2[text()='Top picks for your home']"));
		
		executor.executeScript("arguments[0].scrollIntoView(false);", up2);
		
	}

}

