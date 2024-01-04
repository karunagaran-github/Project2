package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.project.utils.Sewrappers1;

public class FlightPage extends Sewrappers1{
	
	
	@FindBy(xpath="//div[text()='To']")
	public WebElement TO;
	@FindBy(xpath="//div[text()='flight status']")
	public WebElement Flightstatus;
	
	@FindBy(xpath="//div[text()='Kempegowda International Airport']")
	public WebElement Depature;
	
	@FindBy(xpath="//input[@value='SG - ']")
	public WebElement SG;
	
	@FindBy(partialLinkText="Search Flights")
	public WebElement SF;
	
	public void clickFlightstatus() {
		waitForElement(Flightstatus,20);
		clickElement(Flightstatus);
	}
	
	public void clickTO() {
		waitForElement(TO,20);
		clickElement(TO);
	}
	public void clickDepature() {
		waitForElement(Depature,20);
		clickElement(Depature);
	}
	
	public void clickSG(String sg) {
		waitForElement(SG,20);
		typeText(SG,sg);
		//clickElement(SG);
	}
	
	public void clickSF() {
		waitForElement(SF,20);
		clickElement(SF);
	}
		

}
