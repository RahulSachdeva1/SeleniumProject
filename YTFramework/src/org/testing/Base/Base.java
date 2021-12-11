package org.testing.Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	public ChromeDriver driver;
	public Properties pr;
	
	
	@BeforeMethod
	public void OpenBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver95.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
	}
	
	@BeforeMethod
	public void LocatorsFile() throws IOException
	{
		File fl = new File("../YTFramework/ObjectRepository.properties");
		FileReader fr = new FileReader(fl);
		pr = new Properties();
		pr.load(fr);
	}
	
	/*
	@AfterMethod
	public void CloseBrowser() 
	{
	driver.close();
	}
	
	*/
	

}
