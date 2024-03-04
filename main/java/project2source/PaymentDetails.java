package project2source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project2_login.P2_LoginDetails;

public class PaymentDetails extends P2_LoginDetails{
	
	@FindBy(xpath="//p[@class='makeFlex column']")
	WebElement clickcreditcard;
	
	@FindBy(id="cardNumber")
	WebElement enter_cardnumber;
	
	@FindBy(id="expiryMonth")
	WebElement expirymonth;
	
	@FindBy(id="expiryYear")
	WebElement expiryyear;
	
	@FindBy(id="cardCvv")
	WebElement enter_cvv;
	
	@FindBy(id="nameOnCard")
	WebElement name_oncard;
	
	@FindBy(xpath="//button[@class='formBtnFilled appendBottom40  ']")
	WebElement make_payment;
	
	@FindBy(xpath="//span[text()='We are unable to process transactions for this user/card.']")
	WebElement paymentfailulre;
	
	public void click_creditcard()
	{
		clickcreditcard.click();
	}	
	public void enter_cardnumber()
	{
		enter_cardnumber.sendKeys(cardnum);
	}
	
	public boolean iscardnum_entered()
	{
		String cardnum1=enter_cardnumber.getAttribute("value");
		
		if(cardnum1.equals(cardnum))
		{
			return true;
		}
		
		else 
			return false;
	}
	
	public void enter_expirymonth()
	{
		expirymonth.sendKeys(expmonth);
	}
	
	public void enter_expiryyear()
	{
		expiryyear.sendKeys(expyear);
	}
	public void enter_cvv()
	{
		enter_cvv.sendKeys(cvv);
	}
	public void name_oncard()
	{
		name_oncard.sendKeys(nameoncard);
	}
	public void makePayment()
	{
		make_payment.click();
	}	
	
	
	
	public PaymentDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
