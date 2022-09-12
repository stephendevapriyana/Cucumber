package com.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Keywordmore {
	
	public static WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Cucumber_Project\\Chromedriver\\chromedriver.exe");
	    
		driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
	@When("user input the value of {string} and {string}")
	public void user_input_the_value_of_and(String string, String string2) {
		
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("passwd")).sendKeys(string2);
	   
	}
	@Then("user lick login button and naviagte to homepage")
	public void user_lick_login_button_and_naviagte_to_homepage() {
		WebElement sub = driver.findElement(By.cssSelector("#SubmitLogin"));
		sub.click();
	   
	}
	

}
