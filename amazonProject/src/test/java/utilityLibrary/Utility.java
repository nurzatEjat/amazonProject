package utilityLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility {

	
	WebDriver driver;
	

	
	//Utility method
	public Utility(WebDriver passedDriver) {
		driver = passedDriver;
	}

	public void wait(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void moveMouseByElement(WebElement elem) {
		Actions myaction = new Actions(driver);
		myaction.moveToElement(elem).build().perform();
		
	}
	
	public void selectDropdownByIndex(WebElement dropdown, int index) {
		Select mySelect = new Select(dropdown);
		mySelect.selectByIndex(index);
	}

	public String getText(WebElement findElement) {
		return findElement.getText();
	}
	
	public void fill(WebElement elem, String text) {
		try{
		elem.sendKeys(text);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void click(WebElement elem) {
		wait(2);
		elem.click();
	}
	
}
