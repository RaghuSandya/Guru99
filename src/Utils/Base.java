package Utils;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Base {
	public static WebDriver driver;

	@BeforeTest
	public void BrowerOpen() {
		driver = new FirefoxDriver();
		// Time Out
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Enter Url
		driver.get("http://www.demo.guru99.com/V4/");
		/*
		 * // Enter Username
		 * driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(
		 * "mngr122772"); // Password
		 * driver.findElement(By.xpath("//input[@type='password']")).sendKeys(
		 * "ydegUvA"); // Submit
		 * driver.findElement(By.xpath("//input[@type='submit']")).click();
		 */
	}

	@AfterTest
	public void CloseBrowser() {
		try {
			driver.close();

			Runtime.getRuntime().exec("taskkill /F /IM FirefoxDriverServer.exe");

		} catch (Exception anException) {
			anException.printStackTrace();
		}
	}
}