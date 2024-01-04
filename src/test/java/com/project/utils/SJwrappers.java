package com.project.utils;

import java.util.Timer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.project.pages.CheckinPage;
import com.project.pages.FlightPage;
import com.project.pages.HomePage;
import com.project.pages.ManageBookingPage;
import com.project.pages.OnewayPage;
import com.project.pages.PassengerPage;
import com.project.pages.PaymentPage;
import com.project.pages.RoundwayPage;
import com.project.pages.SearchPage;
import com.project.pages.SignupPage;

public class SJwrappers extends Sewrappers1 {
	
	public void signUp(String titl, String first, String last, String country, String ph, String Email,
			String Np, String Cp) {
		HomePage homePage = PageFactory.initElements( driver,HomePage.class);
		SignupPage signupPage = PageFactory.initElements( driver,SignupPage.class);
		homePage.clickSignup();
		windowHandlingParentWindow();
		//acceptAlert();
		signupPage.clickGender(titl);
		signupPage.clickFirstname(first);
		signupPage.clicLastname(last);
		signupPage.clickCountry(country);
		signupPage.clickdate();
		signupPage.clickPhone(ph);
		signupPage.clickEmail(Email);
		signupPage.clickNewpwd(Np);
		signupPage.clickConpwd(Cp);
		signupPage.clickCheckbox();
		signupPage.clickSubmit();
				 
	}
	
	public void logIn(String phone, String pwd) {
		HomePage homePage = PageFactory.initElements( driver,HomePage.class);
		homePage.clickLogin();
		homePage.clickMobile(phone);
		homePage.clickPassword(pwd);
		homePage.clickLoginSubmit();
		
		
				
	}
	
	public void oneWay() {
		OnewayPage onewayPage = PageFactory.initElements( driver,OnewayPage.class);
		RoundwayPage roundwayPage = PageFactory.initElements( driver,RoundwayPage.class);
		PassengerPage passengerPage = PageFactory.initElements( driver,PassengerPage.class);
		SearchPage searchPage = PageFactory.initElements( driver,SearchPage.class);

		onewayPage.clickFrom();
		onewayPage.clickTo();
		roundwayPage.clickDateD();
		roundwayPage.clickSearchFlight();
		
		searchPage.clickResult();
		passengerPage.clickAgree();
		passengerPage.clickPcontinue();
	}
	
	public void RoundWay() {
		RoundwayPage roundwayPage = PageFactory.initElements( driver,RoundwayPage.class);
		roundwayPage.clickRound();
		OnewayPage onewayPage = PageFactory.initElements( driver,OnewayPage.class);
		PassengerPage passengerPage = PageFactory.initElements( driver,PassengerPage.class);
		SearchPage searchPage = PageFactory.initElements( driver,SearchPage.class);

		roundwayPage.clickRound();
		onewayPage.clickFrom();
		onewayPage.clickTo();
		roundwayPage.clickDateD();
		roundwayPage.clickDateR();
		roundwayPage.clickSearchFlight();
		
		searchPage.clickResult();
		passengerPage.clickAgree();
		passengerPage.clickPcontinue();
	}
	
	public void searchResults() {
		SearchPage searchPage = PageFactory.initElements( driver,SearchPage.class);
		searchPage.clickResult();

	}
	
	public void checkin(String ticket, String last) {
		CheckinPage checkinPage = PageFactory.initElements( driver,CheckinPage.class);
		checkinPage.clickCheckin();
		checkinPage.clickTicket(ticket);
		checkinPage.clickLastName(last);
		System.out.println("done");
		checkinPage.clickSBooking();

	}
	
	public void Flightstatus(String fl) {
		FlightPage flightPage = PageFactory.initElements( driver,FlightPage.class);
		flightPage.clickFlightstatus();
		flightPage.clickTO();
		flightPage.clickDepature();
		flightPage.clickSG(fl);
		flightPage.clickSF();

	}
	
	public void manageBooking(String tick, String mail) {
		CheckinPage checkinPage = PageFactory.initElements( driver,CheckinPage.class);
		ManageBookingPage bookingPage = PageFactory.initElements( driver,ManageBookingPage.class);
		
		bookingPage.clickBooking();
		
		checkinPage.clickTicket(tick);
		checkinPage.clickLastName(mail);
		System.out.println("done");
		checkinPage.clickSBooking();
	
	}
	public void payment(String cardno, String name, String mm, String yy, String cvv) {
		PaymentPage paymentPage = PageFactory.initElements( driver,PaymentPage.class);
		
		paymentPage.clickCardNo(cardno);		
		paymentPage.clickCardName(name);
		paymentPage.clickCardMM(mm);
		System.out.println("done");
		paymentPage.clickCardYY(yy);
		paymentPage.clickCVV(cvv);
		paymentPage.clickPayment();

		
	}
}
