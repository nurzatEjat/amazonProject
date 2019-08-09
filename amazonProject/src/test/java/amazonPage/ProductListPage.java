package amazonPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilityLibrary.SetUpPage;

public class ProductListPage extends SetUpPage{

	
	public void verifyLandOnpage() {
		driver.findElement(By.id("s-refinements"));
	}
	
	
	public List<String> getProductName() {
		List<WebElement> listOfProductNames = driver.findElements(By.xpath("//*[@data-index]//span[@class='a-size-medium a-color-base a-text-normal' and text()][1]")); 

		List<String> names = new ArrayList<String>();
		for(WebElement temp: listOfProductNames) {
			names.add(temp.getText());
		}
		return names;
	}
	
	public void sortByIndex(int index) {
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='a-native-dropdown']"));
		
		lab.selectDropdownByIndex(dropdown, index);
	}
	
	
	
}
