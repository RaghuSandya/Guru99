package Guru99;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utils.Base;

public class Guru extends Base {

	@Test
	public void Login() {
		// Enter Username
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr122772");
		// Password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ydegUvA");
		// Submit
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		// Expected Results
		String url = driver.getCurrentUrl();
		System.out.println("After Login Url:" + url);
		if (url.equals("http://www.demo.guru99.com/V4/manager/Managerhomepage.php")) {
			System.out.println("Test case 1 " + "Guru99Bank login Passed.....");
		} else {
			System.out.println("Test case 2 " + "Guru99Bank login failed.....");
		}
		driver.navigate().back();
	}

}
