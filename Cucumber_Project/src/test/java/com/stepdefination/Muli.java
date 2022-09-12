package com.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Muli {
	
	public static WebDriver driver;
	@Given("user enter few words in google")
	public void user_enter_few_words_in_google() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\VEERASURIYA\\Downloads\\Softwar testing\\Cucumber_Project\\Chromedriver\\chromedriver.exe");
	    
	    driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	}
	@When("user enter gives search bar")
	public void user_enter_gives_search_bar() {
	   
		driver.findElement(By.name("q")).sendKeys("jesus");
	}
	@Then("click on boutton")
	public void click_on_boutton() {
	   
		driver.findElement(By.name("q")).click();
	}

	public static WebDriver driver1;
	@Given("open amazon page")
	public void open_amazon_page() {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\VEERASURIYA\\\\Downloads\\\\Softwar testing\\\\Cucumber_Project\\\\Chromedriver\\\\chromedriver.exe");
		
		driver1=new ChromeDriver();
		
		driver1.get("https://www.amazon.in/");
		
	}
	@When("select a produdct")
	public void select_a_produdct() {
	   
		 driver1.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
	}
	@Then("buy clcik")
	public void buy_clcik() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	

}
