package amazonTest;

import org.testng.annotations.Test;

import utilityLibrary.SetUpPage;

public class Product extends SetUpPage {

	@Test
	public void AP_1010() {
		lab.wait(5);
		System.out.println("I am in the Product test");
	}

}
