package project2test;

import org.testng.Assert;
import org.testng.annotations.Test;

import project2source.Goibibo_SearchFlight;
import project2source.Goibibo_SearchResults;

public class Ibibo_Test10 extends LaunchQuit_Ibibo{
	
	//validate flight information, fare details, baggage rules, and cancellation rules in search result page
	

	@Test	
	public void searchresult_pageDetails()
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
		
		Goibibo_SearchResults g2=new Goibibo_SearchResults(driver);
		g2.flight_details();
		
		Assert.assertTrue(g2.isflightinfodisplayed());
		
		g2.fare_details();		
		Assert.assertTrue(g2.isfareinfodisplayed());
		
		g2.baggage_rules();
		Assert.assertTrue(g2.isbaggageinfodisplayed());
		
		g2.cancellation_rules();
		Assert.assertTrue(g2.iscancellationinfodisplayed());
	}

}
