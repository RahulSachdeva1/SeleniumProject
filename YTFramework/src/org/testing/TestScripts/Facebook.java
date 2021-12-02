package org.testing.TestScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Assertions.Asserts;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Facebook {
	
	public ChromeDriver driver;
	
	@Test(dataProvider="datadrive")
	public void DataDriven(String username, String password) throws InterruptedException
	{
		
		String LoginURL = "Log in to Facebook";	
		String LogoutURL = "Facebook – log in or sign up";
		System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver95.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys(username);
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']"));
		pwd.sendKeys(password);
		
		WebElement LogIn = driver.findElement(By.xpath("//button[@name='login']"));
		LogIn.click();
		Thread.sleep(5000);
		
		if (driver.getTitle().equals(LoginURL))
		{
			System.out.println("Incorrect Email or Password.....Please Enter the Correct Password");
			driver.navigate().back();
			driver.close();
		}
		
		else
		{
	    System.out.println("Logged-In Successfully");	
		Thread.sleep(3000);		
		driver.navigate().back();
		System.out.println("Back to Login Page Successfully");
		driver.close();
		}
			
	}
	
	
	
	@DataProvider
	public Object[][] datadrive() throws BiffException, IOException
	{
		File f = new File("../YTFramework/DataDriven.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		int r = ws.getRows();
		int c = ws.getColumns();
		
		Object[][] ob = new Object[r][c];
		for(int i=0; i<r; i++)
		{
			for (int j=0; j<c; j++)
				
			{
				Cell c1 = ws.getCell(j,i);
				ob[i][j] = c1.getContents();
			}
				
		}
		
		return ob;
	}

}
