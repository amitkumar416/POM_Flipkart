package com.flipkart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.base.TestBase;

public class SearchProduct extends TestBase {

	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

	By textspace = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");

	public boolean validateSearch(String product) {
		//wait(2000);
		//driver.findElement(textspace).click();
		//driver.findElement(textspace).sendKeys(product);

		wait(2000);
		driver.findElement(textspace).sendKeys(product);
		
		wait(2000);
		driver.findElement(textspace).sendKeys(Keys.ENTER);

		boolean flagResult = true;

		try {
			wait1.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[2]/div[5]"))); // 
		} catch (TimeoutException te) {
			captureScreenshot("search Failure");
			flagResult = false;
		}

		if (flagResult) {
			String actResult = driver
					.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[2]/div[5]"))
					.getText();
			return actResult.equals("Newest First");
		} else
			return false;
	}

}
