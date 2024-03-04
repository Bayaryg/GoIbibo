package project2source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Goibibo_Classjourney {	
	
	
	@FindBy(xpath="(//input[contains(@class,'SearchInputStyle-sc-f6e3g4-12 gqWtbC')])[4]")
	WebElement changeclass;
	
	@FindBy(xpath="//div[contains(@class,'FlightClassWrapper-sc-1rr7cks-12 gZyCvY')]/div[2]/div/select")
	WebElement selectdropdown;	

	@FindBy(xpath="//button[text()='Done']")
	WebElement selectdone;
	
	@FindBy(xpath="//button[text()='UPDATE SEARCH']")
	WebElement updatesearch;
	
	@FindBy(xpath="//input[contains(@value,'Business')]")
	WebElement businessverify;
	

	@FindBy(xpath="//input[contains(@value,'Premium Economy')]")
	WebElement economysverify;
	

	@FindBy(xpath="//input[contains(@value,'First class')]")
	WebElement firstclassverify;
	
	
	
	public void change_class()
	{
		changeclass.click();
		
	}
	
	public void select_business()
	{
		Select s1=new Select(selectdropdown);
		s1.selectByValue("B");
	}
	
	public boolean is_business_selected()
	{
		boolean businesspass=businessverify.isDisplayed();
		return businesspass;
	}
	
	public void select_Economy()
	{
		Select s1=new Select(selectdropdown);
		s1.selectByValue("W");
	}
	
	public boolean is_economy_selected()
	{
		boolean economypass=economysverify.isDisplayed();
		return economypass;
	}
	public void select_firstclass()
	{
		Select s1=new Select(selectdropdown);
		s1.selectByValue("F");
	}
	
	public boolean is_firstclass_selected()
	{
		boolean firstclasspass=firstclassverify.isDisplayed();
		return firstclasspass;
	}
	
	public void select_complete()
	{
		selectdone.click();
	}
	public void update_search()
	{
		updatesearch.click();
	}
	
	
	public Goibibo_Classjourney(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	

}
