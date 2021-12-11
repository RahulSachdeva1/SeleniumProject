package org.testing.TestScripts;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.utilities.Logs;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC1 extends Base {
	
	
	@Test
	public void TrendingClick() throws InterruptedException, IOException
	{
		
		String expectedURL = "https://www.youtube.com/feed/explore";
		
		WebElement SignIn = driver.findElement(By.xpath(pr.getProperty("SignIn")));
		SignIn.click();
		Logs.takeLogs("TC1", "SignIn Button is working");
		
		
		Login sign = new Login(driver, pr);
		sign.signIn("rahulsachdeva995@gmail.com", "Raj@16021990");
		Logs.takeLogs("TC1", "Successfuly Logged-in");
		
		for(int i=0; i<=1; i++)
		{
			WebElement MainMenu = driver.findElement(By.xpath(pr.getProperty("MainMenu")));
			MainMenu.click();
			Thread.sleep(3000);
		}
		
		WebElement Explore = driver.findElement(By.xpath(pr.getProperty("Explore")));
		Explore.click();
		
		Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
		
		//Asserts.softAssertion(expectedURL, driver.getCurrentUrl());
		Thread.sleep(3000);
		
		WebElement Trending = driver.findElement(By.xpath(pr.getProperty("Trending")));
		Trending.click();
		Thread.sleep(3000);
		
		Logout out = new Logout(driver, pr);
		out.signout();
		Logs.takeLogs("TC1", "Successfully Logout");
		
				
	}	

}
