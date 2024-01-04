package com.project.tests;

import org.testng.annotations.Test;

import com.project.utils.BBreports;
import com.project.utils.SJwrappers;
import com.project.utils.Sewrappers1;

public class Testcase2 extends Sewrappers1 {
	
	SJwrappers SJ= new SJwrappers();
	BBreports report1 = new BBreports();

	//code to open a web browser and navigate to the Best Buy e-commerce website and SIGNUP
	
	@Test
	public void login() throws InterruptedException{
		
			report1.setTCDesc("Validating spice jet link for login");
			launchBrowser("https://www.spicejet.com/");
			//dismissAlert();
			SJ.logIn("8072230663","Ashwin@99");
			getTextAlert();

			System.out.println("Success");
			
	}

}
