package org.junit;

import org.openqa.selenium.WebElement;
import java.awt.AWTException;

public class BaseClassFunctions extends BaseClass{
	
	//public static final String getDataFromExcel = null;

	public static void main(String[] args) throws InterruptedException, AWTException {
		BaseClassFunctions b = new BaseClassFunctions();
		b.browserLaunch("https://www.facebook.com/");
		//b.browserLaunch("https://www.amazon.in/");
		//b.browserLaunch("https://www.flipkart.com/");
		b.getTitle();
		WebElement username = b.findUserName("email");
		b.sendValues(username,"Greens");
		WebElement password = b.findPassword("pass");
		b.sendPassword(password, "Greens@123");
		WebElement login = b.login("login");
		b.loginClick(login);
		
		WebElement fpwd = b.forgotPwd("Forgotten password?");
		b.clickFpwd(fpwd);
		Thread.sleep(3000);
		b.getCurrenturl();
		b.isDisplayed("(//h2[text()='Reset Your Password']) [2]");
		WebElement link = b.notYou("//a[text()='Not you?']");
		b.rightclick(link);
		b.refresh();
		b.goBack();
		b.goForward();
		b.goBack();
		b.goBack();
		WebElement msg = b.messengerView("Messenger");
		b.scrollDown(msg);
		WebElement fb = b.viewFb("//img[@alt='Facebook']");
		b.scrollUp(fb);	
		
	}

}
