package project2source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addon_Details {
	
	@FindBy(xpath="//span[text()='Extra leg-room']")
	WebElement find_legroom;
	
	@FindBy(xpath="//div[@id='row_12']/div[3]")
	WebElement select_legroom;
	
	@FindBy(xpath="(//button[text()='Add'])[1]")
	WebElement add_meal;
	
	@FindBy(xpath="(//button[text()='Add'])[5]")
	WebElement add_baggage;
	
	@FindBy(xpath="//span[text()='ADD']")
	WebElement add_securetrip;
	
	@FindBy(xpath="//button[text()='Proceed To Payment']")
	WebElement proceed_to_payment;
	
	@FindBy(xpath="//p[text()='Seat']")
	WebElement legroomdisplay;
	
	@FindBy(xpath="//p[text()='Meal']")
	WebElement mealdisplay;
	
	@FindBy(xpath="//p[text()='Baggage']")
	WebElement baggagedisplay;
	
	public void find_legroom()
	{
		find_legroom.click();
	}
	
	public void select_legroom()
	{
		select_legroom.click();
	}

	public void add_meals()
	{
		add_meal.click();
	}
	
	public void add_baggage()
	{
		add_baggage.click();
	}
	public void add_securetrip()
	{
		add_securetrip.click();
	}
	public void proceed_to_payment()
	{
		proceed_to_payment.click();
	}
	
	public boolean legroom_selected()
	{
		boolean b1=legroomdisplay.isDisplayed();
		return b1;
	}
	public boolean meal_selected()
	{
		boolean b2=mealdisplay.isDisplayed();
		return b2;
	}
	public boolean baggae_selected()
	{
		boolean b3=baggagedisplay.isDisplayed();
		return b3;
	}
	
	public Addon_Details(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
