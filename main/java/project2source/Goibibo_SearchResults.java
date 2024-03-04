package project2source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Goibibo_SearchResults {
	
	@FindBy(xpath="(//span[text()='Flight Details'])[1]")
	WebElement clickflightdetails;
	
	@FindBy(xpath="//span[text()='Fare Details']")
	WebElement faredetailsclick;
	
	@FindBy(xpath="//span[text()='Baggage Rules']")
	WebElement baggegedetailsclick;
	
	@FindBy(xpath="//span[text()='Cancellation Rules']")
	WebElement cancellationdetailsclick;
	
	@FindBy(xpath="//div[contains(@class, 'srp-card-uistyles__FltDetailCont-sc-3flq99-42 krcEOu width100 flexCol')]")
	WebElement verifyflightdetails;
	
	@FindBy(xpath="//div[contains(@class, 'pad10 padB20')]")
	WebElement verifyfaredetails;
	
	@FindBy(xpath="(//div[contains(@class, 'bagCancelRulesstyles__C')])[2]")
	WebElement verifybaggagedetails;
	
	@FindBy(xpath="//div[contains(@class, 'bagCancelRulesstyles__CancellationWrap-sc-1li590v-7 krKjjL dF justifyBetween')]")
	WebElement verifycancellationdetails;
	
	public void flight_details()
	{
		clickflightdetails.click();
	}	
	public void fare_details()
	{
		faredetailsclick.click();
	}	
	public void baggage_rules()
	{
		baggegedetailsclick.click();
	}
	public void cancellation_rules()
	{
		cancellationdetailsclick.click();
	}
	
	public boolean isflightinfodisplayed()
	{
		boolean flightdetailsdisplay=verifyflightdetails.isDisplayed();
		return flightdetailsdisplay;
	}
	
	public boolean isfareinfodisplayed()
	{
		boolean faredetailsdisplay=verifyfaredetails.isDisplayed();
		return faredetailsdisplay;
	}
	
	public boolean isbaggageinfodisplayed()
	{
		boolean baggagedetailsdisplay=verifybaggagedetails.isDisplayed();
		return baggagedetailsdisplay;
	}
	
	public boolean iscancellationinfodisplayed()
	{
		boolean cancellationdetailsdisplay=verifycancellationdetails.isDisplayed();
		return cancellationdetailsdisplay;
	}
	
	public Goibibo_SearchResults(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
