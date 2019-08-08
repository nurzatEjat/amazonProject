package amazonProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import amazonPage.HeaderPage;
import utilityLibrary.SetUpPage;

public class HeaderTest extends SetUpPage {

	@Test(enabled = false)
	public void AP_1001() {

		header.verifyHomePageTitle();
		header.clickTodayDealLink();
		TDP.verifyTodayDealPage();

		TDP.selectBookFromLeftNavigationBar();

		lab.wait(2);
		String bookLink = driver.findElement(By.xpath("//*[@class='a-link-normal summary']/span")).getText().trim();

		Assert.assertTrue(bookLink.equals("Books"), "Facet NOT working as expect, Please check!");

	}

	@Test(enabled = false)
	public void AP_1002() {
		String expectPageTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		String title = driver.getTitle();
		// Overloading -> it will allowed us to select any
		// assertEquals and passing differnt parameter without change metho name
		Assert.assertEquals(title, expectPageTitle, "User NOT land on HomePage!");

		WebElement tryPrime = driver.findElement(By.xpath("//a[contains(text(),'Try Prime')]"));
		// move our mouse
		lab.moveMouseByElement(tryPrime);
		lab.wait(1);
		driver.findElement(By.xpath("//a[contains(text(),'Get started')]")).click();
		lab.wait(2);
		driver.findElement(By.xpath("//*[@id='OfferSlot']//*[@class='prime-cta-signup-button-inner']")).click();
		boolean isSignInDisplay = false;
		try {
			isSignInDisplay = driver.findElement(By.id("signInSubmit")).isDisplayed();
		} catch (Exception e) {

		}
		Assert.assertTrue(isSignInDisplay, "User NOT land on Sign In page!");
	}

	@Test(enabled = true)
	public void AP_1004() {

		header.verifyHomePageTitle();
		header.clickTodayDealLink();
		TDP.verifyTodayDealPage();
		TDP.selectBookFromLeftNavigationBar();
		TDP.sortPrice(2);
		lab.wait(5);

	}

	/**
	 * Verify search functionality
	 */
	
	@Test
	public void AP_1005() {
		header.verifyHomePageTitle();
		header.fillSearchBox("camera");
		plp.verifyLandOnpage();
		for (String temp : plp.getProductName()) {
			if (temp.contains("camera")) {
				System.out.println(temp);
			} else {
				Assert.fail("Product name doesn't contains: camera " + temp);
			}
		}

		plp.sortByIndex(2);

	}

}
