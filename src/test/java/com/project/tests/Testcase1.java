package com.project.tests;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.project.utils.BBreports;
import com.project.utils.SJwrappers;
import com.project.utils.Sewrappers1;

public class Testcase1 extends Sewrappers1 {
	

	SJwrappers SJ= new SJwrappers();
	BBreports report1 = new BBreports();

	//code to open a web browser and navigate to the Best Buy e-commerce website and SIGNUP
	
	@Test
	public void browserTest() throws InterruptedException{
		
			report1.setTCDesc("Validating spice jet link for signup ");
			launchBrowser("https://www.spicejet.com/");
			
			//dismissAlert();
			SJ.signUp("Mr","Karunagaran","Elango","India ","8072230663","karunagaranelango@gmail.com","Ashwin@99","Ashwin@99");
			
			System.out.println("Success");
			closeAllBrowsers();
			
	}
	

}


