package com.stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datausing_Eg {
	
	public static WebDriver driver;
	@Given("user open mystore login page")
	public void user_open_mystore_login_page() {
	   
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Cucumber_Project\\Chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php?controller=authentication");
	}
  @When("user login credentials")
  public void user_login_credentials() {
	  
	 WebElement s1 = driver.findElement(By.cssSelector("#email"));
	   s1.sendKeys("stephendevapriyan24@gmail.com");
	   
	 WebElement s2 = driver.findElement(By.cssSelector("#passwd"));
	   s2.sendKeys("Stephen@1234");}
  
   @Then("user put singin")
  public void user_put_singin() {
   
	driver.findElement(By.cssSelector("#SubmitLogin")).click();
		   
		
}	
}
