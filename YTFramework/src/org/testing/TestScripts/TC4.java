package org.testing.TestScripts;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.utilities.Logs;
import org.testng.annotations.Test;

public class TC4 extends Base {
	
	
	
	@Test
	public void PlayLike() throws InterruptedException, IOException
	{
		
		WebElement SignIn = driver.findElement(By.xpath(pr.getProperty("SignIn")));
		SignIn.click();
		
		Login sign = new Login(driver, pr);
		sign.signIn("rahulsachdeva995@gmail.com", "Raj@16021990");
		Logs.takeLogs("TC1", "Successfuly Logged-in");
		
		WebElement Play = driver.findElement(By.xpath(pr.getProperty("Play")));
		Play.click();
		Thread.sleep(5000);
		
		WebElement Like = driver.findElement(By.xpath(pr.getProperty("Like")));
		Like.click();
		
		Logout out = new Logout(driver, pr);
		out.signout();
		Logs.takeLogs("TC1", "Successfully Logout");
	}	
	
	
	
	
}
