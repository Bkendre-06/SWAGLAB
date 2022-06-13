package com.purchase.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	WebDriver driver;

	By Product1 = By.xpath("(//*[contains(text(),'Add to cart')])[1]");
	By cartproduct1 = By.xpath("//button[@id='react-burger-menu-btn']");
	By filter = By.xpath("//select[@class='product_sort_container']");
	By LowToHigh = By.xpath("//option[@value=\"lohi\"]");
	By LowProduct1 = By.xpath("//option[@value=\"lohi\"]");

	public AddToCart(WebDriver driver) {
		this.driver = driver;
	}

	public void addProducts() {

		driver.findElement(Product1).click();
		driver.findElement(filter).click();
		driver.findElement(LowToHigh).click();
		driver.findElement(LowProduct1).click();
		driver.findElement(Product1).click();

	}

}
