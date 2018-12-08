package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	private WebDriver driver;
	
	@FindBy(css="div.mod-login-input-phone>input")
	public WebElement txtPhone;
	
	@FindBy(css="div.mod-login-input-name>input")
	public WebElement txtName;
	
	@FindBy(css="div.mod-login-input-email>input")
	public WebElement txtMail;
	
	@FindBy(css="div.mod-input-password>input")
	public WebElement txtPass;
	
	
	@FindBy(xpath="//span[@id=\"month\"]//span[@class=\"next-select-inner\"]")
	public WebElement Fmonth;
	
	
	@FindBy(xpath="//ul[@class=\"next-menu-content\"]//li[@value=\"2\"]")
	public WebElement ChonMonth;
	
	
	
	@FindBy(css="//span[@id=\"day\"]//span[@class=\"next-select-placeholder\"]")
	public WebElement FDay;
	@FindBy(css="//div[@class=\"next-overlay-wrapper opened\"]//ul//li[@value =\"5\"]")
	public WebElement ChonDay;
	
	
	@FindBy(css="//span[@id=\"year\"]//span[@class=\"next-select-placeholder\"]")
	public WebElement FYear;
	@FindBy(css="//div[@class=\"next-overlay-wrapper opened\"]//ul//li[@value =\"5\"]")
	public WebElement ChonYear;
	
	
	@FindBy(css="div.mod-login-btn>button[type=\"submit\"]")
	public WebElement FBtnSignUp;
	
	@FindBy(xpath="//div[@id=\"anonLogin\"]//a[@class=\"grey\"]")
	public WebElement Login;
	
	public SignUpPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}