package amazonPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import utilityLibrary.SetUpPage;

public class TodayDealPage extends SetUpPage{

	
	//PageFactory
	@FindBy(xpath="//div[contains(@class,'gbh1-bold')]") WebElement pageHeader;
	
	@FindBy(xpath ="(//span[contains(text(),'Books') and contains(@class,'a-checkbox-label')]/..//input)[1]")
		WebElement leftNavBarBookCheckBox;
	@FindBy(xpath="//*[@name='sortOptions']") WebElement dropdown;
	
	
	public void verifyTodayDealPage() {
		String header = lab.getText(pageHeader);

		Assert.assertTrue(header.equals("Today's Deals"), "****User has NOT sucssfully land on DealPage!****");
	}

	public void selectBookFromLeftNavigationBar() {
		leftNavBarBookCheckBox.click();
	}

	public void sortPrice(int i) {
		try {
		lab.selectDropdownByIndex(dropdown, i);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
