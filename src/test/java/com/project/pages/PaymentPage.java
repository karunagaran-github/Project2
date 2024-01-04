package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.project.utils.Sewrappers1;

public class PaymentPage extends Sewrappers1{
	
	@FindBy(id ="card_number")//input[@id='card_number']
	public WebElement CardNo;
	
	@FindBy(id ="name_on_card")
	public WebElement CardName;
	
	@FindBy(id ="card_exp_month")
	public WebElement CardMM;
	
	@FindBy(id ="card_exp_year")
	public WebElement CardYY;
	
	@FindBy(id ="security_code")
	public WebElement CVV;
	
	@FindBy(xpath="//div[text()='Proceed to pay']")
	public WebElement Payment;
	
	public void clickCardNo(String cno) {		
	waitForElement(CardNo,20);
	typeText(CardNo,cno);		
	}
	
	public void clickCardName(String cname) {		
	waitForElement(CardName,20);
	typeText(CardName,cname);		
	}
	
	public void clickCardMM(String MM) {		
	waitForElement(CardMM,20);
	typeText(CardMM,MM);		
	}
	
	public void clickCardYY(String YY) {		
	waitForElement(CardYY,20);
	typeText(CardYY,YY);		
	}	
	
	public void clickCVV(String cvv) {		
	waitForElement(CVV,20);
	typeText(CVV,cvv);		
	}
	
	public void clickPayment() {
		waitForElement(Payment,20);
		clickElement(Payment);
	}


}
