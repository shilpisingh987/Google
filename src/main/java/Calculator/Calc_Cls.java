package Calculator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import Maping.Cities;

public class Calc_Cls {

	
	@Test
	public void Initialization(){

		
		
		System.setProperty("webdriver.chrome.driver", "..//GoogleMap//src//main//resources//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" http://ata123456789123456789.appspot.com/ ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		this.userMain(driver);
		
	}
		public void userMain(WebDriver driver) {
			
			Main_Cls Mnc = new Main_Cls(driver);
			
			Mnc.FirstNo().clear();
			Mnc.FirstNo().sendKeys("7");
			Mnc.SecondNo().clear();
			Mnc.SecondNo().sendKeys("4");
			
			Mnc.RadioBtn().click();
			
			Mnc.CalcBtn().click();
			
			String main=Mnc.Result().getText();
			
			System.out.println(main);
			
			driver.close();
}
		
		}
