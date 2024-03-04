package project2source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Goibibo_SearchFlight {
	
	@FindBy(xpath="//span[@class='logSprite icClose']")
	WebElement closebutton;
	
	@FindBy(xpath="(//span[@class='sc-12foipm-83 TdSAp'])[1]")
	WebElement roundtrip;
	
	@FindBy(xpath="(//span[@class='sc-12foipm-83 TdSAp'])[2]")
	WebElement multicity;
	
	@FindBy(xpath="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[1]")
	WebElement fromlocation;
	
	
	@FindBy(xpath="//input[@type='text']")
	WebElement enterfromlocation;
	
	@FindBy(xpath="//div[@class='sc-12foipm-37 lfkrPI']/ul/li[1]")
	WebElement selectfromlocation;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement entertolocation;
	
	@FindBy(xpath="//div[@class='sc-12foipm-37 lfkrPI']/ul/li[1]")
	WebElement selecttolocation;
	
	@FindBy(xpath="(//p[text()='24'])[2]")
	WebElement  selectDate;
	
	@FindBy(xpath="(//p[text()='28'])[2]")
	WebElement returnDate;
	
	@FindBy(xpath="(//p[text()='26'])[1]")
	WebElement multicitydate;
	
	@FindBy(xpath="(//span[text()='Done'])")
	WebElement confirmdate;
	
	@FindBy(xpath="(//span[text()='Cancel'])")
	WebElement canceldate;
	
	@FindBy(xpath="(//span[@class='sc-12foipm-64 dGRyPm'])[2]")
	WebElement adult;
	
	@FindBy(xpath="(//span[@class='sc-12foipm-64 dGRyPm'])[4]")
	WebElement child;
	
	@FindBy(xpath="//p[text()='4 Adults, 1 Child']")
	WebElement passengersadded;
	
	@FindBy(xpath="(//a[text()='Done'])")
	WebElement confirmnum;

	@FindBy(xpath="//span[text()='SEARCH FLIGHTS']")
	WebElement searchflight;
	
	@FindBy(xpath="//span[contains(text(),'showing')]")
	WebElement searchresults;
	
	@FindBy(xpath="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[6]")
	WebElement tolocation;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement entertolocation1;
	
	@FindBy(xpath="//div[@class='sc-12foipm-37 lfkrPI']/ul/li[1]")
	WebElement selecttolocation1;
	
	@FindBy(xpath="//div[text()='Multicity Flights']")
	WebElement multicityvalidate;
	

	public void closepopup()
	{
		closebutton.click();
	}
	
	public void select_roundtrip()
	{
		roundtrip.click();
	}
	
	public void select_multicity()
	{
		multicity.click();
	}
	public void fromcity()
	{
		fromlocation.click();		
	}
	
	public void enterfromcity()
	{
		enterfromlocation.sendKeys("BLR");
		enterfromlocation.sendKeys(Keys.ENTER);
	}
	public void select_fromlocation()
	{
		selectfromlocation.click();
	}
	
	public void entertocity()
	{
		enterfromlocation.sendKeys("DEL");
		enterfromlocation.sendKeys(Keys.ENTER);
	}
	
	public void select_tolocation()
	{
		selecttolocation.click();
	}
	
	public void tosecondcity()
	{
		tolocation.click();		
	}
	
	public void entertocity_mult()
	{
		enterfromlocation.sendKeys("BOM");
		enterfromlocation.sendKeys(Keys.ENTER);
	}
	
	public void select_tolocation_mult()
	{
		selecttolocation.click();
	}
	
	public void multicity_selectdate()
	{
		multicitydate.click();
	}
	public void select_date()
	{
		selectDate.click();
	}
	
	public void return_date()
	{
		returnDate.click();
	}
	
	public void confirm_date()
	{
		confirmdate.click();
	}
	
	public void cancel_date()
	{
		canceldate.click();
	}
	public void add_adult()
	{
		adult.click();
	}
	
	public void add_child()
	{
		child.click();
	}
	
	public void confirm_passengernum()
	{
		confirmnum.click();
	}
	
	public void search_flight()
	{
		searchflight.click();
	}
	public boolean passengers_added()
	{
		boolean pass2=passengersadded.isDisplayed();
		return pass2;
	}
	
	public boolean is_searchsuccessfull()
	{
		boolean pass=searchresults.isDisplayed();
		return pass;
	}
	
	public boolean is_multicity_searchsuccessfull()
	{
		boolean pass=multicityvalidate.isDisplayed();
		return pass;
	}
	
	
	
	public Goibibo_SearchFlight(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
