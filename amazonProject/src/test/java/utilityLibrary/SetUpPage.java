package utilityLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import amazonPage.HeaderPage;
import amazonPage.ProductListPage;
import amazonPage.TodayDealPage;

public class SetUpPage {

	public static WebDriver driver;
	public static Utility lab ;
	public static HeaderPage header = new HeaderPage();
	public static TodayDealPage TDP = new TodayDealPage();
	public static ProductListPage plp = new ProductListPage();
	public static LocatorReader locator = new LocatorReader();
	ConfigurationReader conf = new ConfigurationReader();
	
	
	
	@BeforeMethod
	public void startTest() {
		String driverPath ="src/test/resources/chromedriver";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		lab =  new Utility(driver);
		
		driver.get(conf.setConfiguration("Url"));
		driver.manage().window().fullscreen();
	}
	
	@AfterMethod
	public void endTest() {
//		wait(2);
		driver.close();
		driver.quit();
	}
	
	
	

	
}
