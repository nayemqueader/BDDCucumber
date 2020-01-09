package com.ntiit.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	
WebDriver driver;

	//1.create constructor
	public LoginPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// 2.find web elements with locator
	////*[@id="tdb5"]/span[2]
	@FindBy(xpath="//*[@id=\"tdb3\"]/span[2]") WebElement click_account;
	@FindBy(name="email_address") WebElement edit_email;
	@FindBy(name="password") WebElement edit_password;
	@FindBy(xpath="//*[@id=\"tdb1\"]/span[2]") WebElement click_signin;
	
	//3.create method 
	
	public WebElement Account() {
		return click_account;
		
	}
	public WebElement Email() {
		return edit_email;
		
	}
	
	public WebElement Password() {
		return edit_password;
		
	}
	public WebElement Signin() {
		return click_signin;
	}
}
