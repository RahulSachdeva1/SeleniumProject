package org.testing.TestScripts;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.utilities.Logs;
import org.testng.annotations.Test;

public class TC6 extends Base {
	

	
	@Test
	public void CommentVideo() throws InterruptedException, IOException
	{
		
		WebElement SignIn = driver.findElement(By.xpath(pr.getProperty("SignIn")));
		SignIn.click();
		
		Login sign = new Login(driver, pr);
		sign.signIn("rahulsachdeva995@gmail.com", "Raj@16021990");
		Logs.takeLogs("TC1", "Successfuly Logged-in");
		
		WebElement Play = driver.findElement(By.xpath(pr.getProperty("Play")));
		Play.click();
		Thread.sleep(5000);		
		
		Actions ac1 = new Actions(driver);
		ac1.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(5000);		
		
		WebElement CommentField = driver.findElement(By.xpath(pr.getProperty("CommentField")));
		CommentField.click();
		Thread.sleep(3000);	
		
		WebElement Commenting = driver.findElement(By.xpath(pr.getProperty("Commenting")));
		Commenting.sendKeys("Beautiful Song Ever");
		Thread.sleep(3000);	
		
		
		WebElement CommentButton = driver.findElement(By.xpath(pr.getProperty("CommentButton")));
		CommentButton.click();
		Thread.sleep(5000);		
		
		Logout out = new Logout(driver, pr);
		out.signout();
		Logs.takeLogs("TC1", "Successfully Logout");
		
		
	}	
	
	

}
