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

public class Data_Exp {
	
	public static WebDriver driver;
	@Given("user is on login credentials")
	public void user_is_on_login_credentials() {
	    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Cucumber_Project\\Chromedriver\\chromedriver.exe");
	    
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    
	    driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
	}
	@When("user enter below credentials")
	public void user_enter_below_credentials(io.cucumber.datatable.DataTable dataTable) {
	  
		List<String> asList = dataTable.asList();
		
		String string = asList.get(0);
		
		String string2 = asList.get(1);
		
		
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys(string);
		 WebElement findElement2 = driver.findElement(By.id("passwd"));
		 findElement2.sendKeys(string2);
		
//		driver.findElement(By.id("email")).sendKeys(asList.get(0).get(0));
//		
//		 driver.findElement(By.id("passwd")).sendKeys(asList.get(0).get(1));
//		
	}
	@Then("user click login button and naviagte to homepage")
	public void user_click_login_button_and_naviagte_to_homepage() {
		
		WebElement sub = driver.findElement(By.cssSelector("#SubmitLogin"));
		sub.click();
	   
		
	}




}
