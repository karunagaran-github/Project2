package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.project.utils.Sewrappers1;

public class SearchPage extends Sewrappers1{
	
	@FindBy(xpath="//div[@data-testid='continue-search-page-cta']")
	public WebElement Results;
	
	public void clickResult() {
		waitForElement(Results,20);
		clickElement(Results);
	}

}
