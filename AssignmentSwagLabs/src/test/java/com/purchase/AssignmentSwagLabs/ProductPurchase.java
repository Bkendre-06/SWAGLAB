package com.purchase.AssignmentSwagLabs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.purchase.pom.AddToCart;
import com.purchase.pom.LoginPage;
import com.purchase.pom.OpenBasket;
import com.purchase.pom.PriceFilter;

import io.cucumber.java.en.*;

public class ProductPurchase extends Base {

	WebDriver driver = null;

	@Given("Broser is open")
	public void broser_is_open() {
		System.out.println("broser_is_open");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\2193491\\workspace\\AssignmentSwagLabs\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

	}

	@And("user is on SwagLabs website")
	public void user_is_on_swag_labs_website() {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		System.out.println("user_is_on_swag_labs_website");
	}

	@When("user enters login credentials")
	public void user_enters_login_credentials() throws InterruptedException {

		System.out.println("user_enters_login_credentials");

		LoginPage lp = new LoginPage(driver);
		lp.login();

	}

	@And("user added products in AddToCart")
	public void user_is_added_products_in_add_to_cart() {

		System.out.println("user_is_added_products_in_add_to_cart");

		PriceFilter pf = new PriceFilter(driver);
		pf.applyFilter();

		AddToCart AC = new AddToCart(driver);
		AC.addProducts();

	}

	@Then("user is checkouting")
	public void user_is_checkouting() {

		System.out.println("user_is_checkouting");

		OpenBasket OB = new OpenBasket(driver);
		OB.checkout();
		driver.close();
	}
}
