package Calculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main_Cls {
	
WebDriver driver;
	
	public Main_Cls(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='ID_nameField1']")
	WebElement FirstNo;
	
	@FindBy(xpath="//input[@id='ID_nameField2']")
	WebElement SecondNo;
	
	@FindBy(xpath="//input[@name='myRadioGroup']/following::label[text()='Euclid(-)']")
	WebElement RadioBtn;
	
	@FindBy(xpath="//button[@id='ID_calculator']")
	WebElement CalcBtn;
	
	@FindBy(xpath="//td[text()='Result(Value):']/following::td")
	WebElement Result;
	
	public WebElement FirstNo() {

		return FirstNo;
	}

	public WebElement SecondNo() {

		return SecondNo;
	}

	public WebElement RadioBtn() {

		return RadioBtn;
	}

	public WebElement CalcBtn() {

		return CalcBtn;
	}

	public WebElement Result() {

		return Result;
	}

	
}
