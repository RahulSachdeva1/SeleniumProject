package org.testing.Assertions;

public class Asserts {
	
	
	public static void softAssertion(String expected, String actual)
	{
		if(actual.equals(expected))
			
		{
			System.out.println("Assertion is Passed");
		}
		
		else
		{
			System.out.println("Assertion is Failed");
		}
	}
	
	
}
