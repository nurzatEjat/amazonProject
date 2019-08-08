package amazonPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilityLibrary.SetUpPage;

public class TodayDealPage extends SetUpPage{

	
	public void verifyTodayDealPage() {
		String header = lab.getText(driver.findElement(By.xpath("//div[contains(@class,'gbh1-bold')]")));
		
//		if(header.equals("Today's Deals")) {
//			System.out.println("User has sucssfully land on DealPage!");
//		}else {
//			System.out.println("****User has NOT sucssfully land on DealPage!****");
//		}
		Assert.assertTrue(header.equals("Today's Deals"), "****User has NOT sucssfully land on DealPage!****");
	}

	public void selectBookFromLeftNavigationBar() {
		driver.findElement(
				By.xpath("(//span[contains(text(),'Books') and contains(@class,'a-checkbox-label')]/..//input)[1]")).click();
	}

	public void sortPrice(int i) {
		try {
		WebElement dropdown = driver.findElement(By.xpath("//*[@name='sortOptions']"));
		lab.selectDropdownByIndex(dropdown, i);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
