package project2test;

import org.testng.Assert;
import org.testng.annotations.Test;

import project2source.Goibibo_SearchFlight;

public class Ibibo_Test9 extends LaunchQuit_Ibibo{
	
	//to handle multiple passengers in single booking
	@Test	
	public void oneway_flightsearch()
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
		
		for(int i=1;i<=3;i++)
		{
			g1.add_adult();
		}
		
		g1.add_child();
		g1.confirm_passengernum();
		Assert.assertTrue(g1.passengers_added());
		
		g1.search_flight();
		
		Assert.assertTrue(g1.is_searchsuccessfull());
		
	}

}
