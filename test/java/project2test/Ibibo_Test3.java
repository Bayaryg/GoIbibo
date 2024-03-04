package project2test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import project2_login.P2_LoginDetails;
import project2source.Goibibo_Registration;

public class Ibibo_Test3 extends LaunchQuit_Ibibo {

	
	//login with invalid otp	

			@Test	
			public void Login_with_invalidotp() throws InterruptedException, EncryptedDocumentException, IOException
			{
				P2_LoginDetails.testdata();
				Goibibo_Registration g1=new Goibibo_Registration(driver);
				g1.enter_mobilenum();
				g1.continueto_otp();
				g1.enter_otp();
				
				Assert.assertEquals(g1.login_failure_message(), "Please enter a valid OTP");			
				
				
			}
}
