package amazonPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilityLibrary.SetUpPage;

public class HeaderPage extends SetUpPage {
	
	WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
	WebElement searchButton = driver.findElement(By.id("nav-search-submit-text"));
	
	

	public void clickTodayDealLink() {
		driver.findElement(By.xpath("//a[contains(text(),'Deals')]")).click();
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

		lab.fill(searchBox, text);
		lab.click(searchButton);
		
		
	}
	
	public void signIn(String userName, String password) {
	// update for new change	
	}
	
}
