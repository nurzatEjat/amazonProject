package amazonPage;

import org.openqa.selenium.By;

import utilityLibrary.SetUpPage;

public class HeaderPage extends SetUpPage {

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
		
	}
	
	public void signIn(String userName, String password) {
	// update for new change	
	}
	
}
