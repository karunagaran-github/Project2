package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.project.utils.Sewrappers1;

public class SignupPage extends Sewrappers1{
	
	@FindBy(xpath="//select[@class='form-control form-select ']")
	public WebElement Title;
	
	@FindBy(xpath="//input[@id='first_name']")
	public WebElement Firstname;
	
	@FindBy(id="last_name")
	public WebElement Lastname;
	
	@FindBy(xpath="//select[@tabindex='0']")
	public WebElement Country;
	
	@FindBy(xpath="//input[@id='dobDate']")
	public WebElement DOB;
	
	@FindBy(xpath="//div[@aria-label='Choose Wednesday, December 14th, 2005']")
	public WebElement Date;
	
	@FindBy(xpath="//input[@type='tel']")
	public WebElement Phone;
	
	@FindBy(id="email_id")
	public WebElement Email;
	
	@FindBy(id="new-password")
	public WebElement Newpwd;
	
	@FindBy(id="c-password")
	public WebElement Conpwd;
	
	@FindBy(xpath="//input[@id='defaultCheck1']")
	public WebElement Checkbox;
	
	@FindBy(xpath="//button[@class='btn btn-red']")
	public WebElement Submit;
	
	public void clickGender(String title) {
		waitForElement(Title,20);
		selectByVisibleText(Title,title);
	}
	
	public void clickFirstname(String firstname) {
		waitForElement(Firstname,20);
		typeText(Firstname,firstname);
	}
	
	public void clicLastname(String lastname) {
		waitForElement(Lastname,20);
		typeText(Lastname,lastname);
	}
	
	public void clickCountry(String country) {
		waitForElement(Country,20);
		selectByVisibleText(Country,"India");
	}
	
	public void clickdate() {
		waitForElement(DOB,20);
		clickElement(DOB);
		waitForElement(Date,20);
		clickElement(Date);
	}
	
	public void clickPhone(String num) {
		waitForElement(Phone,20);
		typeText(Phone,num);
	}
	
	public void clickEmail(String mail) {
		waitForElement(Email,20);
		typeText(Email,mail);
	}
	
	public void clickNewpwd(String Npwd) {
		waitForElement(Newpwd,20);
		typeText(Newpwd,Npwd);
	}
	
	public void clickConpwd(String Cpwd) {
		waitForElement(Conpwd,20);
		typeText(Conpwd,Cpwd);
	}
	
	public void clickCheckbox() {
		waitForElement(Checkbox,20);
		clickElement(Checkbox);
		if (!Checkbox.isSelected()) {
            // Click the checkbox to select it
            Checkbox.click();
        }
	}
	
	public void clickSubmit() {
		waitForElement(Submit,20);
		clickElement(Submit);
	}

}
