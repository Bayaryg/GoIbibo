package project2test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project2source.Goibibo_SearchFlight;
import project2source.Traveller_Details;

public class Ibibo_Test13 extends LaunchQuit_Ibibo{
	
	//check if the person is able to apply the coupon code
	
	@Test	
	public void book_flight() throws InterruptedException
	{
		Goibibo_SearchFlight g1=new Goibibo_SearchFlight(driver);
		g1.closepopup();
		g1.fromcity();
		g1.enterfromcity();
		g1.select_fromlocation();
		g1.entertocity();
		g1.select_tolocation();
		g1.select_date();
		g1.confirm_date();
		g1.add_adult();
		g1.confirm_passengernum();
		g1.search_flight();		
		Assert.assertTrue(g1.is_searchsuccessfull());
		
		Traveller_Details g2=new Traveller_Details(driver);		
		g2.viewfare_click();
		g2.bookflight_click(driver);		
		Assert.assertTrue(g2.is_switchedto_reviewbooking());		
		g2.list_coupon();
		g2.select_coupon();
		Assert.assertTrue(g2.coupon_selectedmessage());
		g2.close_couponwindow();
		
		
		
	}

}
