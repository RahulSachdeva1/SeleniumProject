package org.testing.TestScripts;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.utilities.Logs;
import org.testng.annotations.Test;

public class TC3 extends Base {
	

	
	@Test
	public void Subscriptons() throws InterruptedException, IOException
	{
		
		WebElement SignIn = driver.findElement(By.xpath(pr.getProperty("SignIn")));
		SignIn.click();
		
		Login sign = new Login(driver, pr);
		sign.signIn("rahulsachdeva995@gmail.com", "Raj@16021990");
		Logs.takeLogs("TC1", "Successfuly Logged-in");
		
		for(int i=0; i<=1; i++)
		{
			WebElement MainMenu = driver.findElement(By.xpath(pr.getProperty("MainMenu")));
			MainMenu.click();
			Thread.sleep(3000);
		}
		
		WebElement Subscription = driver.findElement(By.xpath(pr.getProperty("Subscription")));
		Subscription.click();
		Thread.sleep(5000);
		
		Logout out = new Logout(driver, pr);
		out.signout();
		Logs.takeLogs("TC1", "Successfully Logout");
		
		
		
	}
		
	
	

}
