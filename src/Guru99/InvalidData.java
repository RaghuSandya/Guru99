package Guru99;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utils.Base;

public class InvalidData extends Base {
/*	@Test(priority = 1)
	public void Valid() {
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr122772");
		// Password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ydegUvA");
		// Submit
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.navigate().back();
	}*/

	@Test(priority = 1)
	public void InvalidName() {
		// Enter Username
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr12277");
		// Password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ydegUvA");
		// Submit
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		// PopUp Get
		Alert at = driver.switchTo().alert();
		at.accept();
	}

	@Test(priority = 2)
	public void Invalidpass() {
		// Enter Username
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr122772");
		// Password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ydegUv");
		// Submit
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		// PopUp Get
		Alert at1 = driver.switchTo().alert();
		at1.accept();
	}

	@Test(priority = 3)
	public void InvalidBoth() {
		// Enter Username
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr12277");
		// Password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ydegUv");
		// Submit
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		// PopUp Get
		Alert at3 = driver.switchTo().alert();
		at3.accept();
	}

}
