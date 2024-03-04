package project2test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import project2_login.P2_LoginDetails;
import project2source.Goibibo_Logout;
import project2source.Goibibo_Registration;
import project2source.Goibibo_SearchFlight;

public class Ibibo_Test12 extends LaunchQuit_Ibibo{
	
	//login search flight logout	

			@Test	
			public void Login_searchflight_logout() throws InterruptedException, EncryptedDocumentException, IOException
			{
				P2_LoginDetails.testdata();
				Goibibo_Registration g2=new Goibibo_Registration(driver);
				g2.enter_mobilenum();
				g2.continueto_otp();
				g2.enter_otp();
				
				Assert.assertEquals(g2.login_success_message(), "You have successfully logged in");			
				g2.skipenteringdetails();
				
				Goibibo_SearchFlight g1=new Goibibo_SearchFlight(driver);
				
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
				
				Goibibo_Logout g3=new Goibibo_Logout(driver);
				g3.hoverover_account(driver);
				g3.click_profile();
				g3.logout();
				g3.confirmlogout();
				
				Assert.assertTrue(g3.islogoutsuccess());
				
			}
			

}
