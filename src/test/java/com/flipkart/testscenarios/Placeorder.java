package com.flipkart.testscenarios;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flipkart.base.TestBase;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.SearchProduct;
import com.flipkart.pages.SearchResultPage;

public class Placeorder extends TestBase {
	@BeforeClass
	public void setUp() {
		launchBrowser();
		navigateToURL();
	}

	@AfterClass
	public void tearDown() {
	//	driver.quit();
	}

	@Test(priority = 1)
	public void loginTest() {
		LoginPage loginPage = new LoginPage();
		boolean actResult = loginPage.validateLogin("7479354532", "AMITkumar@123");
		Assert.assertTrue(actResult);
	}

	@Test(priority = 2)
	public void searchProductTest() {
		SearchProduct search = new SearchProduct();

		boolean actResult1 = search.validateSearch("laptop");
		Assert.assertTrue(actResult1);

	}
	
	@Test(priority = 3)
	public void selectProductTest() {
		SearchResultPage selectfirst = new SearchResultPage();

		boolean actResult2 = selectfirst.validateSelect();
		Assert.assertTrue(actResult2);
}
}
