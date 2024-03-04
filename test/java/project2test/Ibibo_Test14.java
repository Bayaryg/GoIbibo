package project2test;

import org.testng.Assert;
import org.testng.annotations.Test;

import project2source.Goibibo_SearchFlight;

public class Ibibo_Test14 extends LaunchQuit_Ibibo{
	
	
	//search for domestic roundtrip flights	
	
	@Test	
	public void domestic_flightsearch()
	{
		Goibibo_SearchFlight g1=new Goibibo_SearchFlight(driver);
		g1.closepopup();
		g1.select_roundtrip();
		g1.fromcity();
		g1.enterfromcity();
		g1.select_fromlocation();
		g1.entertocity();
		g1.select_tolocation();
		g1.select_date();
		g1.return_date();
		g1.confirm_date();
		g1.add_adult();
		g1.confirm_passengernum();
		g1.search_flight();
		
		Assert.assertTrue(g1.is_searchsuccessfull());
		
	}

}
