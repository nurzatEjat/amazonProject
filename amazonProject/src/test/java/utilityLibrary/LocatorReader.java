package utilityLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorReader extends SetUpPage{
	String filePath = "src/test/resources/locator.properties";
	Properties prop;
	
	
	
	public LocatorReader() {
		try {
		prop = new Properties();
	
		FileInputStream file = new FileInputStream(filePath);
		prop.load(file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public By getLocator(String locatorName) {

		//get locator type and value by Key
		//prop.getProperties(key);
		String locator = prop.getProperty(locatorName);

		//use split or sub-string to
		//seaperate type and value
		
//		String type =locator.split(":")[0];    //1.Xpath    2.//a[contains(text(),'Deals')]
//		String value = locator.split(":")[1];
		
		int endIndex = locator.indexOf(":");
		String type = locator.substring(0, endIndex);
		String value = locator.substring(endIndex+1);

		//use if-else or switch to land on 
		//different combanation
		//Xpath, id, CSS, name, Class, partiallinkText,etc...  By.Xpath, By.id
		By result = null;
		switch(type.toLowerCase()) {
		case "xpath":
			result = By.xpath(value);
			break;
		case "id":
			result = By.id(value);
			break;
		case "css":
			result = By.cssSelector(value);
			break;
		case "name":
			result = By.name(value);
			break;
		case "class":
			result = By.className(value);
			break;
		case "partialLinkText":
			result = By.partialLinkText(value);
			break;
		case "linkText":
			result = By.linkText(value);
			break;
		case "tagName":
			result = By.tagName(value);
			break;
		default:
			System.out.println("Locator type is worng, Please check "+locator);
		}
		
		return result;
	}
	
	
	public WebElement getElement(String locatorName) {
		WebElement result = null;
		result = lab.findElement(getLocator(locatorName));
		
		return result;
	}

	
}
