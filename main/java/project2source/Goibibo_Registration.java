package project2source;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import project2_login.P2_LoginDetails;

public class Goibibo_Registration extends P2_LoginDetails {	
	
	
	@FindBy(css="input.loginCont__input")
	WebElement mobilenumber;
	
	@FindBy(xpath="//button[text()='Continue']")
	WebElement conitnueclick;
	
	@FindBy(xpath="//h3[text()='Congratulations']")
	WebElement successmessage;
	
	@FindBy(xpath="//button[text()='I’ll do it later']")
	WebElement skipenteringname;
	
	@FindBy(xpath="//p[text()='You have successfully logged in']")
	WebElement successfuloginmessage;
	
	@FindBy(xpath="//p[text()='Please enter a valid OTP']")
	WebElement invalidotpmessage;
	
	
	
	public void enter_mobilenum()
	{
		mobilenumber.sendKeys(moblienumber);
	}
	
	public void continueto_otp()
	{
		conitnueclick.click();
	}
	
	public void enter_otp() throws InterruptedException
	{
		Thread.sleep(5000);		
	}
	
	public String reg_success_message()
	{
		String message1=successmessage.getText();
		return message1;
	}
	
	public String login_success_message()
	{
		String message2=successfuloginmessage.getText();
		return message2;
	}
	
	public String login_failure_message()
	{
		String message3=invalidotpmessage.getText();
		return message3;
	}
	
	public void skipenteringdetails()
	{
		skipenteringname.click();
	}
	
	
	
	public Goibibo_Registration(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


}
