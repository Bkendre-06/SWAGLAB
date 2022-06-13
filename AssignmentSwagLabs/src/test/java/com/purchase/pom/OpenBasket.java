package com.purchase.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OpenBasket {
	WebDriver driver;

	By Basket = By.xpath("//a[@class='shopping_cart_link']");

	By Checkout = By.xpath("//button[@class='btn btn_action btn_medium checkout_button']");

	By FName = By.xpath("//input[@id='first-name']");

	By LName = By.xpath("//input[@id='last-name']");

	By pincode = By.xpath("//input[@id='postal-code']");

	By Continue = By.xpath("//input[@id='continue']");

	By Finish = By.xpath("//button[@id='finish']");

	public OpenBasket(WebDriver driver) {
		this.driver = driver;

	}

	public void checkout() {

		driver.findElement(Basket).click();
		driver.findElement(Checkout).click();
		driver.findElement(FName).sendKeys("uSER1");
		driver.findElement(LName).sendKeys("uSER2");
		driver.findElement(pincode).sendKeys("451715");
		driver.findElement(Continue).click();
		driver.findElement(Finish).click();

	}

}
