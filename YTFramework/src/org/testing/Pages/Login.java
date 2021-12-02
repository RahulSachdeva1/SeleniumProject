package org.testing.Pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.utilities.ScreenshotCapture;


public class Login {
	
	public ChromeDriver driver;
	public Properties pr;
	
	public Login(ChromeDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
	}
	
	public void signIn(String username, String pwd) throws IOException, InterruptedException
	{
		WebElement Email = driver.findElement(By.xpath(pr.getProperty("Email")));
		Email.sendKeys(username);
		ScreenshotCapture.takescreenshot(driver, "D:\\Screenshot\\first1.png");
		
		WebElement Next = driver.findElement(By.xpath(pr.getProperty("Next")));
		Next.click();
		Thread.sleep(3000);
		
		WebElement Password = driver.findElement(By.xpath(pr.getProperty("Password")));
		Password.sendKeys(pwd);
		
		WebElement Next1 = driver.findElement(By.xpath(pr.getProperty("Next1")));
		Next1.click();
		Thread.sleep(5000);	
	}
	
	
	

}
