package com.stepdefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinationdemo {
	
	public static WebDriver driver;
	@Given("user goes to mystore login page")
	public void user_goes_to_mystore_login_page() {
		
	   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Cucumber_Project\\Chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
	@When("user give {string} and {string}")
	public void user_give_and(String string, String string2) {
		
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("passwd")).sendKeys(string2);
	   
	}
	@Then("user click loin buton")
	public void user_click_loin_buton() {
		
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span/text()"));
		findElement.click();
	}
	
}



	


