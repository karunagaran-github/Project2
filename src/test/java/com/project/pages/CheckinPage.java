package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.project.utils.Sewrappers1;

public class CheckinPage extends Sewrappers1{

	@FindBy(xpath="//div[text()='check-in']")
	public WebElement Checkin;
	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[1]")
	public WebElement Ticket;
	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[2]")
	public WebElement LastName;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-ubezar r-1kfrs79'])[1]")
	//div[text()='Search Booking']
	public WebElement SBooking;
	
	public void clickCheckin() {
		waitForElement(Checkin,20);
		clickElement(Checkin);
	}
	
	public void clickTicket(String ticket) {
		waitForElement(Ticket,20);
		typeText(Ticket,ticket);
	}
	
	public void clickLastName(String last) {
		waitForElement(LastName,20);
		typeText(LastName,last);
	}
	public void clickSBooking() {
		waitForElement(SBooking,20);
		clickElement(SBooking);
	}
		
	
}
