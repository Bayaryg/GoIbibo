package project2test;

import org.testng.Assert;
import org.testng.annotations.Test;

import project2source.Goibibo_SearchFlight;
import project2source.Goibibo_Classjourney;

public class Ibibo_Test6 extends LaunchQuit_Ibibo{

	//validate search result for different classes(business, economy,first)
	
	@Test	
	public void diffclass_journey()
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
		
		Goibibo_Classjourney g2=new Goibibo_Classjourney(driver);
		g2.change_class();
		g2.select_business();
		g2.select_complete();
		g2.update_search();
		Assert.assertTrue(g2.is_business_selected());
		
		g2.change_class();
		g2.select_Economy();
		g2.select_complete();
		g2.update_search();
		
		Assert.assertTrue(g2.is_economy_selected());
		g2.change_class();
		g2.select_firstclass();
		g2.select_complete();
		g2.update_search();
	//	Assert.assertTrue(g2.is_firstclass_selected());
	}
}
