package amazonTest;

import org.openqa.selenium.By;

import utilityLibrary.LocatorReader;

public class TestingClass {

	 static LocatorReader locator = new LocatorReader();
	
	
	public static void main(String[] args) {
		By value =locator.getLocator("header.todayDealLink");
		System.out.println(value);
		


	}
}
