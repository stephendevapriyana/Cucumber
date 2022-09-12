package com.stepdefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Selecttr {
	
	
    public static WebDriver driver;
	@Given("login facebook")
	public void login_facebook() {
	  
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Cucumber_Project\\Chromedriver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@When("user gives <{string}> and <{string}>")
	public void user_gives_and(String string, String string2) {
	   
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("pass")).sendKeys(string2);
	}
	@Then("and clicks singin")
	public void and_clicks_singin() {
	    
	 driver.findElement(By.id("login")).click();
	}


	
			}
