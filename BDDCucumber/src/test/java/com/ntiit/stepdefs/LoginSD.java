package com.ntiit.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ntiit.pageobjectmodel.LoginPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSD {
	WebDriver driver;
	
	@Given("^user visiting homepage$")
	public void user_visiting_homepage() throws Throwable {
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://demo.oscommerce.com");
	
	
	}

	@Given("^click My Account button$")
	public void click_My_Account_button() throws Throwable {
	   LoginPOM obj1=new LoginPOM(driver);
	   obj1.Account().click();
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String email, String pass) throws Throwable {
	    LoginPOM obj2=new LoginPOM(driver);
	    obj2.Email().sendKeys(email);
	    obj2.Password().sendKeys(pass);
	}

	@When("^user clickn sign in button$")
	public void user_clickn_sign_in_button() throws Throwable {
	   LoginPOM obj3=new LoginPOM(driver);
	   obj3.Signin().click();
	}

	@Then("^user successfully login to the system$")
	public void user_successfully_login_to_the_system() throws Throwable {
	  
	}

	@Then("^user click on Log off Button for logout$")
	public void user_click_on_Log_off_Button_for_logout() throws Throwable {
	
	}
}
