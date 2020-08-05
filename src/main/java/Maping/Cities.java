package Maping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cities {
	
	WebDriver driver;
	
	public Cities(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[contains(@name,'q')]")
	WebElement signin;
	
	@FindBy(xpath="//label[contains(text(),'View Hotels')]")
	WebElement SelectHotel;
	
	@FindBy(xpath="//span[text()='More filters']")
	WebElement Filter;
	
	@FindBy(xpath="//input[@aria-label='Free Wi-Fi']")
	WebElement amen1;
	
	@FindBy(xpath="//input[@aria-label='Pool']")
	WebElement amen2;
	
	@FindBy(xpath="//input[@aria-label='3-star']")
	WebElement Class;
	
	@FindBy(xpath="//button[text()='DONE']")
	WebElement Done;
	
	@FindBy(xpath="//span[text()='Jurys Inn London Holborn']")
	WebElement hotel;
	
	@FindBy(xpath="(//img[@class='ugiz4pqJLAG__icon'])[1]")
	WebElement location;
	
	@FindBy(xpath="(//img[@class='ugiz4pqJLAG__icon'])[3]")
	WebElement contactNo;
	
	
	public WebElement signin() {

		return signin;
	}
	
	public WebElement SelectHotel() {

		return SelectHotel;
	}
	
	
	public WebElement Filter() {

		return Filter;
	}

	public WebElement Class() {

		return Class;
	}
	
	public WebElement amen1() {

		return amen1;
	}
	
	public WebElement amen2() {

		return amen2;
	}
	
	public WebElement Done() {

		return Done;
	}

	public WebElement hotel() {

		return hotel;
	}
	
	public WebElement location() {

		return location;
	}
	
	public WebElement contactNo() {

		return contactNo;
	}
}
