package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.project.utils.Sewrappers1;

public class OnewayPage extends Sewrappers1 {
	@FindBy(xpath="//div[text()='From']")
	public WebElement From;
	
	@FindBy(xpath="//div[text()='Delhi']")
	public WebElement FromPlace;
	
	@FindBy(xpath="//input[@value='Select Destination']")
	public WebElement To;
	
	@FindBy(xpath="//div[text()='Chennai International Airport']")
	public WebElement Place;
	
	@FindBy(xpath="//div[@data-testid='one-way-radio-button']")
	public WebElement one;
	
	public void clickFrom() {
		waitForElement(From,20);
		clickElement(From);
		waitForElement(FromPlace,20);
		clickElement(FromPlace);
		waitForElement(one,20);
		clickElement(one);

	}
	
	public void clickTo() {
		waitForElement(To,20);
		clickElement(To);
		//typeText(To,dest);
		waitForElement(Place,20);
		clickElement(Place);	
	}


}
