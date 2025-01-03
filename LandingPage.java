package Shah.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	

	@FindBy(id = "userEmail")
	WebElement user;
	
	@FindBy(id = "userPassword")
	WebElement pass;
	
	@FindBy(id = "login")
	WebElement log;
	
	public void login(String name, String password) {
		user.sendKeys(name);
		pass.sendKeys(password);
		log.click();
	}
	
	public void link() {
		driver.get("https://rahulshettyacademy.com/client");
	}

}
