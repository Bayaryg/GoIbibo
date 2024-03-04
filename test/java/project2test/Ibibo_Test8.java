package project2test;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import project2_login.P2_LoginDetails;
import project2source.Addon_Details;
import project2source.Goibibo_SearchFlight;
import project2source.Traveller_Details;

public class Ibibo_Test8 extends LaunchQuit_Ibibo{
	
	//verify additional options like luggage, extra leg room, food, beverages& selecting them will add additional costs
	@Test	
	public void additional_options () throws EncryptedDocumentException, IOException, InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
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
		Traveller_Details g2=new Traveller_Details(driver);		
		g2.viewfare_click();
		g2.bookflight_click(driver);
	   	g2.enter_address();
	 	g2.enter_pincode();
		g2.gender();		
		g2.enter_firstname();		
		g2.enter_lastname();
		g2.enter_phnumber();
		g2.enter_email();
		g2.secure_trip();
		g2.confirm_billingaddress();
		g2.proceed_button();		
		g2.confirm_details();		
		Addon_Details g3= new Addon_Details(driver);
		g3.find_legroom();
		g3.select_legroom();
		g3.add_meals();
		g3.add_baggage();
		g3.proceed_to_payment();
		Assert.assertTrue(g3.baggae_selected());
		Assert.assertTrue(g3.meal_selected());
		Assert.assertTrue(g3.legroom_selected());
	
	}
	
	
}


