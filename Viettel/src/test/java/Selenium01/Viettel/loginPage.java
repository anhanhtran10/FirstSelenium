package Selenium01.Viettel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	private WebDriver driver;
	@FindBy(xpath="//div[@id=\"anonLogin\"]//a[@class=\"grey\"]")
	public WebElement Login;
	
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
