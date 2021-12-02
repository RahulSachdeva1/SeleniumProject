package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCapture {
	
	public static void takescreenshot(ChromeDriver driver, String screenshotpath) throws IOException
	{
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File(screenshotpath));
	}
	
	

}
