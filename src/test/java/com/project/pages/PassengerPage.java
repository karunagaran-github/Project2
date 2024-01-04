package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.project.utils.Sewrappers1;

public class PassengerPage extends Sewrappers1{
	
	@FindBy (xpath="//input[@data-testid='city-inputbox-contact-details']")
	public WebElement City;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-zso239'])[5]")
	public WebElement Agree;
	
	
	
	@FindBy(xpath="//div[text()='Continue']")
	public WebElement Pcontinue;
	
	public void clickCity(String city) {
		waitForElement(City,20);
		typeText(City,city);
	}
	
	public void clickAgree() {
		waitForElement(Agree,20);
		clickElement(Agree);
	}
	
	public void clickPcontinue() {
		waitForElement(Pcontinue,20);
		clickElement(Pcontinue);
	}
	
}
