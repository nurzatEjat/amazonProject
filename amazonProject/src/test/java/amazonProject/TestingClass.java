package amazonProject;

import org.openqa.selenium.By;

import utilityLibrary.LocatorReader;

public class TestingClass {

	static LocatorReader locator = new LocatorReader();
	
	
	public static void main(String[] args) {
		String value =locator.getLocator("todayDealLink");
		System.out.println(value);
		

		String type =value.split(":")[0];  //1.Xpath           2.//a[contains(text(),'Deals')]
		String locatorValue = value.split(":")[1];
		if(type == "Xpath") {By test = By.xpath(locatorValue);}
		if(type == "id") {By test = By.id(locatorValue);}
	}
}
