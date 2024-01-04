package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.project.utils.Sewrappers1;

public class HomePage extends Sewrappers1 {
	
	@FindBy(linkText="Signup")
	public WebElement Signup;
	
	@FindBy(xpath="//div[text()='Login']")
	public WebElement Login;
	
	@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
	public WebElement Mobile;
	
	@FindBy(xpath="//input[@data-testid='password-input-box-cta']")
	public WebElement Password;
	
	@FindBy(xpath="//div[@data-testid='login-cta']")
	public WebElement LoginSubmit;
	
	@FindBy(xpath="//div[text()='Flights']")
	public WebElement Flight;
	
	
	
	public void clickSignup() {
		waitForElement(Signup,20);
		clickElement(Signup);
			
	}
	
	public void clickLogin() {
		waitForElement(Login,20);
		clickElement(Login);
			
	}
	
	public void clickMobile(String mob) {
		waitForElement(Mobile,20);
		typeText(Mobile,mob);
			
	}
	
	public void clickPassword(String pwd) {
		waitForElement(Password,20);
		typeText(Password,pwd);
			
	}
	
	public void clickLoginSubmit() {
		waitForElement(LoginSubmit,20);
		clickElement(LoginSubmit);
		
	}

}
