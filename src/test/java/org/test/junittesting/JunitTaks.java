package org.test.junittesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class JunitTaks extends BaseClass {
	
public static void main(String[] args) {
	launchBrowser();
	openBrowser("https://www.facebook.com/");
	maximize();
	WebElement txtEmail = driver.findElement(By.id("email"));
	type(txtEmail, "welcome");
	Assert.assertEquals("welcome", "welcome");
	
	WebElement txtPass = driver.findElement(By.id("pass"));
	type(txtPass, "Testing");
	Assert.assertEquals("testing", "Testing");
	
	WebElement login = driver.findElement(By.name("login"));
	click(login);
}
}
