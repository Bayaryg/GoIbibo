package project2source;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import project2_login.P2_LoginDetails;

public class Traveller_Details extends P2_LoginDetails{

	
	@FindBy(xpath="(//button[text()='VIEW FARES'])[1]")
	WebElement viewfareclick;
	
	@FindBy(xpath="(//span[@class='db clearfix posRel'])[1]")
	WebElement bookclick;
	
	@FindBy(xpath="//div[text()='Review your booking']")
	WebElement reviewbooking;
	
	@FindBy(id="Billing Address")
	WebElement billingaddress;
	
	@FindBy(id="Pincode")
	WebElement pin_code;
	
	@FindBy(xpath="//select[contains(@class,'CustSelectTrvl-sc-ilw4bs-9 lpjPee')]")
	WebElement gender;//FEMALE
	
	@FindBy(xpath="//input[@name='givenname']")
	WebElement first_name;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement last_name;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email_id;
	
	@FindBy(xpath="//input[@name='mobile']")
	WebElement mobile_number;
	
	@FindBy(xpath="//div[@class='sc-lnPyaJ dEHJVt']")
	WebElement statename;
	
	@FindBy(xpath="//ul[@class='sc-iapWAC bPcczV']/li")
	List<WebElement> listofstates;
	
	@FindBy(xpath="//span[text()='VIEW ALL COUPONS']")
	WebElement listofcoupons;
	
	@FindBy(xpath="(//span[@class='common-elementsstyles__CheckBox-sc-ilw4bs-2 TIWwk'])[1]")
	WebElement selectcoupon;
	
	@FindBy(xpath="//div[text()='Awesome! Promo discount applied']")
	WebElement couponaddedsuccessfully;
	
	@FindBy(xpath="//button[text()='OK']")
	WebElement closecouponwindow;
	
	@FindBy(xpath="//button[text()='Secure my Trip']")
	WebElement securetrip;
	
	@FindBy(xpath="//span[@class='sc-ktPPKK hKXtqD']")
	WebElement confirm_billing_address;
	
	@FindBy(xpath="//button[text()='Proceed']")
	WebElement proceed;
	
	@FindBy(xpath="//button[text()='That’s Correct']")
	WebElement confirm_details;
	
	@FindBy(xpath="//button[text()='OK']")
	WebElement popup;
	
	public void viewfare_click()
	{
		viewfareclick.click();
	}	
	
	public void bookflight_click(WebDriver driver) throws InterruptedException
	{
		bookclick.click();
		Thread.sleep(3000);
		switchwindow(driver);
		
	}
	
	 public void switchwindow(WebDriver driver)
	 {	 		 
			Set<String> winhandle=driver.getWindowHandles();
			Iterator<String> ids=winhandle.iterator();										
			String parentid=ids.next();
			String childid=ids.next();						
			driver.switchTo().window(childid);
	 }
	
	public boolean is_switchedto_reviewbooking()
	{
		boolean check=reviewbooking.isDisplayed();
		return check;
	}
	

	public void enter_address()
	{
		billingaddress.sendKeys(address);
	}
		

	public void enter_pincode()
	{
		pin_code.sendKeys(pincode);
	}
	
	public void state_click()
	{
		statename.click();
	}
	
	public void gender()
	{
		Select s2=new Select(gender);
		s2.selectByValue("FEMALE");
	}
	
	public void select_state()
	{
		int totalstates=listofstates.size();
		
		for(int i=0;i<totalstates;i++)
		{
			if(listofstates.get(i).getText()==state)
			{
				listofstates.get(i).click();
			}
		}
	}

	public void enter_firstname()
	{
		first_name.sendKeys(firstname);
	}
	
	public boolean entered_firstname()
	{
		String fname=first_name.getText();
		
		if(fname.equals(firstname))
		{
			return true;
		}
		else
			
		return false;
	}

	public void enter_lastname()
	{
		last_name.sendKeys(lastname);
	}

	public void enter_email()
	{
		email_id.sendKeys(emailid);
	}
	
	public boolean entered_email()
	{
		String email1=email_id.getText();
		if(email1.equals(emailid))
		{
			return true;
		}
		
		else
			return false;
	}
	
	public void enter_phnumber()
	{
		mobile_number.sendKeys(moblienumber);;
	}	
	
	public void list_coupon()
	{
		listofcoupons.click();
	}	
	public void select_coupon()
	{
		selectcoupon.click();
	}	
	public boolean coupon_selectedmessage()
	{
		boolean ismessagedisplayed=couponaddedsuccessfully.isDisplayed();
		return ismessagedisplayed;
	}
	
	public void close_couponwindow()
	{
		closecouponwindow.click();
	}
	
	public boolean iscoupon_added()
	{
		boolean radiobutton=selectcoupon.isSelected();
		return radiobutton;
	}
	
	public void secure_trip()
	{
		securetrip.click();
	}	
	public void confirm_billingaddress()
	{
		confirm_billing_address.click();
	}
	
	public void proceed_button()
	{
		proceed.click();
	}
	
	public void popup_clear()
	{
		popup.click();
	}
	public void confirm_details()
	{
		confirm_details.click();
	}
		
	
	public Traveller_Details(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
