package amazonPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilityLibrary.SetUpPage;

public class ProductListPage extends SetUpPage{
	List<WebElement> listOfProductNames = driver.findElements(By.xpath("//*[@data-index]//span[contains(@class,'text-normal') and text()]")); 
	
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
}
