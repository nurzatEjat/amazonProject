package amazonPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilityLibrary.SetUpPage;

public class HeaderPage extends SetUpPage {


	//PageFactory
	
	@FindBy(xpath="")
	WebElement todayDeal;

	@FindBy(id="twotabsearchtextbox") WebElement searchBox;

	
	public void clickTodayDealLink() {
		lab.click(lab.findElement(locator.getLocator("header.todayDealLink")));
		lab.wait(5);
	}

	public void verifyHomePageTitle() {
		String homepageTitle = driver.getTitle();
		String expectPageTitle = 
				"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		if(homepageTitle.equals(expectPageTitle)) {
			System.out.println("User has sucssfully land on Homepage!");
		}else {
			System.out.println("****User has NOT sucssfully land on Homepage!****");
		}
	}
	
	public void fillSearchBox(String text) {

//		WebElement searchButton = driver.findElement(By.id("nav-search-submit-text"));
		WebElement searchButton = driver.findElement(By.xpath("//*[@id='nav-search-submit-text']/..//input"));

		
		lab.fill(searchBox, text);
		lab.click(searchButton);
		
		
	}
	
	public void signIn(String userName, String password) {
	// update for new change	
	}
	
}
