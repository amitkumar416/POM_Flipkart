package com.flipkart.pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.flipkart.base.TestBase;

public class SearchResultPage extends TestBase {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	By selectlaptop = By
			.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]");

	public boolean validateSelect() {

		driver.findElement(selectlaptop).click();

		String papa = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();

		boolean flagResult = true;

		for (String kin : child) {
			if (!kin.equals(papa))
				driver.switchTo().window(kin);
			
		}

		System.out.println("Title in select product : " + driver.getTitle());
		
		
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/ul/li[1]/div/div/img")));
				
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div[1]/div")));

			} catch (TimeoutException te) {
				captureScreenshot("select product failure");
				flagResult = false;
			}
		
		
		String actResult2 = null;

		if (flagResult) {
			actResult2 = driver
					.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div[1]/div"))
					.getText();
			System.out.println("Actual Result:  " + actResult2);
			return actResult2.equals("Coupons for you");
		} else {
			System.out.println("Actual Result:  " + actResult2);
			return false;

		}
	}
}
