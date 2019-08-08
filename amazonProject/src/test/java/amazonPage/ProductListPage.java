package amazonPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilityLibrary.SetUpPage;

public class ProductListPage extends SetUpPage{
	List<WebElement> listOfProductNames = driver.findElements(By.xpath("//*[@data-index]//span[contains(@class,'text-normal') and text()]")); 
	WebElement dropdown = driver.findElement(By.xpath("//select[@class='a-native-dropdown']"));
	
	
	public void verifyLandOnpage() {
		driver.findElement(By.id("s-refinements"));
	}
	
	
	public List<String> getProductName() {
		List<String> names = null;
		for(WebElement temp: listOfProductNames) {
			names.add(temp.getText());
		}
		return names;
	}
	
	public void sortByIndex(int index) {
		lab.selectDropdownByIndex(dropdown, index);
	}
	
	
	
}
