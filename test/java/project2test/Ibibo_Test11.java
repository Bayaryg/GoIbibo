package project2test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import project2_login.P2_LoginDetails;
import project2source.Goibibo_SearchFlight;
import project2source.Traveller_Details;

public class Ibibo_Test11 extends LaunchQuit_Ibibo{

	//click on book flight and check that we are able to enter data for all textfields
	
	@Test	
	public void enter_userdetails() throws InterruptedException, EncryptedDocumentException, IOException
	{
		P2_LoginDetails.testdata();
		Goibibo_SearchFlight g1=new Goibibo_SearchFlight(driver);
		g1.closepopup();
		g1.fromcity();
		g1.enterfromcity();
		g1.select_fromlocation();
		g1.entertocity();
		g1.select_tolocation();
		g1.select_date();
		g1.confirm_date();		
		g1.confirm_passengernum();
		g1.search_flight();
		
		Assert.assertTrue(g1.is_searchsuccessfull());
		
		Traveller_Details g2=new Traveller_Details(driver);
		
		g2.viewfare_click();
		g2.bookflight_click(driver);
		

	    Assert.assertTrue(g2.is_switchedto_reviewbooking());
		
		g2.enter_address();
	 	g2.enter_pincode();
		g2.state_click();
		g2.select_state();
		g2.gender();
		g2.enter_firstname();
		
		g2.enter_lastname();
		g2.enter_phnumber();
		g2.enter_email();
//		Assert.assertTrue(g2.entered_firstname());
//		Assert.assertTrue(g2.entered_email());
//		
	
	}
}
