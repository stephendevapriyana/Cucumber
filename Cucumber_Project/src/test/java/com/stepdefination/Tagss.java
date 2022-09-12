package com.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tagss {
	
	public static WebDriver driver;
	@Given("User enters the G page")
	public void user_enters_the_g_page() {
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Cucumber_Project\\Chromedriver\\chromedriver.exe");
	    
	    driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	   
	}
	@When("User finds the g icon above the search bar")
	public void user_finds_the_g_icon_above_the_search_bar() {
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
		
	    
	}
	@Then("User able to see multiple color of g")
	public void user_able_to_see_multiple_color_of_g() {
	   
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
	}
	public static WebDriver driver1;
	@Given("User enters the y page")
	public void user_enters_the_y_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Cucumber_Project\\Chromedriver\\chromedriver.exe");

		 driver1=new ChromeDriver();
		driver1.get("https://in.search.yahoo.com/?fr2=inr");
	   
	}
	@When("User finds the y icon above the search bar")
	public void user_finds_the_y_icon_above_the_search_bar() {
		
		driver1.findElement(By.xpath("//*[@id=\"logo\"]"));
	   
	}
	@Then("User able to see multiple color of y")
	public void user_able_to_see_multiple_color_of_y() {
		driver1.findElement(By.xpath("//*[@id=\"logo\"]"));
		
	}
	public static WebDriver driver2;
	@Given("User enters the b page")
	public void user_enters_the_b_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Cucumber_Project\\Chromedriver\\chromedriver.exe");

		 driver2=new ChromeDriver();
		 driver2.get("https://www.bing.com/");
	}
	@When("User finds the b icon above the search bar")
	public void user_finds_the_b_icon_above_the_search_bar() {
		driver2.findElement(By.xpath("//*[@id=\"sb_form_q\"]"));
	}
	@Then("User able to see multiple color of b")
	public void user_able_to_see_multiple_color_of_b() {
	   
		driver2.findElement(By.xpath("//*[@id=\"sb_form_q\"]"));
	}



}
