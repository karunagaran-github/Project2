package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.project.utils.Sewrappers1;

public class ManageBookingPage extends Sewrappers1{

	@FindBy(xpath="//div[text()='manage booking']")
	public WebElement Booking;
	
	
	
	public void clickBooking() {
		waitForElement(Booking,20);
		clickElement(Booking);
	}
	
	
		
	

}
