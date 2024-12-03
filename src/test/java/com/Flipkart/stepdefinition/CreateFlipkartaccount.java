package com.Flipkart.stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Flipkart.Baseclass.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateFlipkartaccount extends Baseclass {

	Baseclass base = new Baseclass();
	static WebDriver driver;
	static WebDriverWait wait;

	@Given("User launches the Flipkart Login  {string}")
	public void user_launches_the_Flipkart_Login(String url) {
		base.launchApplication(url);
		driver = base.driver;
	  
	}

	@Then("user validate the launched application  {string}")
	public void user_validate_the_launched_application(String Url) {
		String currentUrl = base.currentUrl();
		if (currentUrl.startsWith(Url)) {
			System.out.println("Application is launched");	
		}
		else {
			System.out.println("Application is not launched");
		}
	
	   
	}

	@When("User click on Fashion")
	public void user_click_on_Fashion() {
		WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		fashion.click();
	   
	}

	@When("User selects the Men Top wear")
	public void user_selects_the_Men_Top_wear() {
		WebElement menTopWear = driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']"));
		menTopWear.click();	  
	}

	@Then("User validate the top wear")
	public void user_validate_the_top_wear() {
		try {
			WebElement shirt = driver.findElement(By.xpath("//a[@class='hEjLuS WyLc0s']"));
			shirt.click();
			List<WebElement> menShirts = driver.findElements(By.xpath("//a[@class='WKTcLC']"));
		for (int i = 0; i < menShirts.size(); i++) {
			WebElement shirts = menShirts.get(i);
			String text = shirts.getText();
			System.out.println(text);
			
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	    
	}

	@When("User searches for an item in search field")
	public void user_searches_for_an_item_in_search_field() {
		try {
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		search.sendKeys("Mobiles", Keys.ENTER);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		


	}


	@When("User selects the Mobiles")
	public void user_selects_the_Mobiles() {
		WebElement mobiles = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']"));
		mobiles.click();
		WebElement cart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		cart.click();
	    
	}

	@Then("User validates the mobile prices")
	public void user_validates_the_mobile_prices() {
	   
	}


	
	


}
