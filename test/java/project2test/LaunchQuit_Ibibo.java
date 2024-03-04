package project2test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchQuit_Ibibo {
	
	public static WebDriver driver;
	@BeforeMethod	
	
	public void launch_browser()
	{
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
			
		
	}
	
//	@AfterMethod
//	public void close_browser() throws IOException
//	
//	{
//		TakesScreenshot ts1=(TakesScreenshot)driver;
//		File source=ts1.getScreenshotAs(OutputType.FILE);
//		File destination=new File(".\\ScreenshotsProject2\\"+getClass()+".jpeg");
//		FileUtils.copyFile(source, destination);
//		
//		driver.quit();
//		
//	}

}
