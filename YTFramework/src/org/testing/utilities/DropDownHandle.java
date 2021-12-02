package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {
	
	
	public static void selectByIndex(WebElement element, int indexNumber)
	{
		Select s = new Select(element);
		s.selectByIndex(indexNumber);
	}
	
	public static void selectByVisibleText(WebElement element, String visibleText)
	{
		Select s = new Select(element);
		s.selectByVisibleText(visibleText);
	}
	
	public static void selectByValue(WebElement element, String value)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
	

}
