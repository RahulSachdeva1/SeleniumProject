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

public class TC5 extends Base {
	
	
	@Test
	public void ChannelSubscribe() throws InterruptedException, IOException
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
		ac1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		WebElement Subscribe = driver.findElement(By.xpath(pr.getProperty("Subscribe")));
		Subscribe.click();
		Thread.sleep(3000);
		
		Logout out = new Logout(driver, pr);
		out.signout();
		Logs.takeLogs("TC1", "Successfully Logout");
		
		
	}	
	
		

}
