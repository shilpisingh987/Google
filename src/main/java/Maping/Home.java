package Maping;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Home {
	
	@Test
	public void Initialization(){

		
		
		System.setProperty("webdriver.chrome.driver", "..//GoogleMap//src//main//resources//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.google.nl/maps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		this.userLogin(driver);
		
	}
	
public void userLogin(WebDriver driver) {
	
	Cities cts = new Cities(driver);
	cts.signin().sendKeys("London",Keys.ENTER);
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1500)");
	
	 
	cts.SelectHotel().click();
	cts.Filter().click();
	cts.Class().click();
	cts.amen1().click();
	cts.amen2().click();
	cts.Done().click();
	JavascriptExecutor js1= (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,1000)");
	
	cts.hotel().click();
	JavascriptExecutor js2= (JavascriptExecutor) driver;
	js2.executeScript("window.scrollBy(0,2500)");
	cts.location().click();
	cts.contactNo().click();
	
	driver.quit();
	
}
    
	
	
	
	
	

	
}
