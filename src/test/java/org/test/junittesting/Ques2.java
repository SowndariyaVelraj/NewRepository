package org.test.junittesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ques2 extends BaseClass{
	public static void main(String[] args) {
		launchBrowser();
		maximize();
		openBrowser("https://www.redbus.in/");
		WebElement cc = driver.findElement(By.id("signin-block"));
		click(cc);
		WebElement dd = driver.findElement(By.id("hc"));
		click(dd);

}
	public void news() {
		// TODO Auto-generated method stub

	}
	public void newMethod() {

		System.out.println("a");
		
	}
	public void abvc() {
		// TODO Auto-generated method stub

	}
}
