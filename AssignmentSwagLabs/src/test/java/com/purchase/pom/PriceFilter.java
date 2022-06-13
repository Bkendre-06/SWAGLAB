package com.purchase.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PriceFilter {

	WebDriver driver;

	By filter = By.xpath("//select[@class='product_sort_container']");
	By HighToLow = By.xpath("//option[@value=\"hilo\"]");

	public PriceFilter(WebDriver driver) {
		this.driver = driver;
	}

	public void applyFilter() {
		driver.findElement(filter).click();
		driver.findElement(HighToLow).click();
	}

}
