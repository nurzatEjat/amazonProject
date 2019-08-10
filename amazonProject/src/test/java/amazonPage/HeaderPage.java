package amazonPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilityLibrary.SetUpPage;

public class HeaderPage extends SetUpPage {
	
	By todayDealLink = By.xpath("//a[contains(text(),'Deals')]");
	By todaydiscountLink = By.xpath("//a[contains(text(),'Deals')]");
	By dealLink = By.xpath("//a[contains(text(),'Deals')]");
	By todayDealLink1 = By.xpath("//a[contains(text(),'Deals')]");
	By todayDealLink2= By.xpath("//a[contains(text(),'Deals')]");
	By todayDealLink3 = By.xpath("//a[contains(text(),'Deals')]");
	
	
	public static void main(String[] args) {
		System.out.println(locator.getLocator("todayDealLink"));
	}
	

	public void clickTodayDealLink() {
		lab.click(lab.findElement(todayDealLink));
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

		WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
//		WebElement searchButton = driver.findElement(By.id("nav-search-submit-text"));
		WebElement searchButton = driver.findElement(By.xpath("//*[@id='nav-search-submit-text']/..//input"));

		
		lab.fill(searchBox, text);
		lab.click(searchButton);
		
		
	}
	
	public void signIn(String userName, String password) {
	// update for new change	
	}
	
}
