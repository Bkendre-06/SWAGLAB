package com.purchase.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	By username = By.id("user-name");
	By password = By.id("password");
	By loginButton = By.id("login-button");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void login() throws InterruptedException {
		driver.findElement(username).sendKeys("standard_user");
		driver.findElement(password).sendKeys("secret_sauce");
		driver.findElement(loginButton).click();

	}

}
