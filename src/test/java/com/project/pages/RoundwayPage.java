package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.project.utils.Sewrappers1;

public class RoundwayPage extends Sewrappers1{
	
	@FindBy (xpath="//div[text()='round trip']")
	public WebElement Round;//div[text()='Tue, 2 Jan 2024']
	
	@FindBy (xpath="//div[text()='Departure Date']")
	public WebElement DateD;
	
	@FindBy (xpath="(//div[text()='14'])[2]")
	public WebElement DateD1;
	
	@FindBy (xpath="//div[text()='Select Date']")
	public WebElement DateR;
			
	@FindBy (xpath="(//div[text()='1'])[3]")
	public WebElement DateR1;		
	
	@FindBy (xpath="//div[@data-testid='home-page-flight-cta']")
	public WebElement SearchFlight;


	
	public void clickRound() {
		waitForElement(Round,20);
		Actions act = new Actions(driver);
		act.click(Round).perform();
		 
	}
	
	public void clickDateD() {
		waitForElement(DateD,20);
		//clickElement(DateD); 
		waitForElement(DateD1,20);
		clickElement(DateD1); 
		
	}
	
	public void clickDateR() {
		waitForElement(Round,20);
		clickElement(Round);
		waitForElement(DateR,20);
		clickElement(DateR); 
		waitForElement(DateR1,20);
		clickElement(DateR1); 
		
	}
	
	public void clickSearchFlight() {
		waitForElement(SearchFlight,20);
		clickElement(SearchFlight); 
	}
	
	

}
