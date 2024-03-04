package project2source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Goibibo_Logout {
	
	@FindBy(xpath="//div[@class='sc-kbousE IIuiH']")
	WebElement profilehover;
	
	@FindBy(xpath="//p[@class='sc-gEvEer kPKMkg']")
	WebElement clickprofile;
	
	@FindBy(xpath="//button[@class='sc-11civud-0 fzjMGi']")
	WebElement logout;
	
	@FindBy(xpath="//button[text()='Yes, Log out']")
	WebElement confirmlogout;
	
	@FindBy(xpath="//p[@class='sc-19vq0g0-5 YLgMD']")
	WebElement logoutsuccess;
	
	 public void hoverover_account(WebDriver driver)
	  {
		  Actions a1=new Actions(driver);
		  a1.moveToElement(profilehover).perform();
	  }	
	 
	 public void click_profile()
		{
			clickprofile.click();
		}
	 
	 public void logout()
	 {
		 logout.click();
	 }
	 
	 public void confirmlogout()
	 {
		 confirmlogout.click();
	 }
	 
	 public boolean islogoutsuccess()
	 {
		boolean val= logoutsuccess.isDisplayed();
		return val;
	 }
	 
	 public Goibibo_Logout(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

}
