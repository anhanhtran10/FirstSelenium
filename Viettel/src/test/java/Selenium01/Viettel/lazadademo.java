package Selenium01.Viettel;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.SignUpPage;

public class lazadademo {
WebDriver driver;

@Test

public void firstTestCase()
{
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	driver= new ChromeDriver();
	
	driver.get("https://member.lazada.vn/user/register?spm=a2o4n.login_signup.header.d6.2c23705b1rmcdV");
	
	//Nhap Username
	/*SignUpPage SUPage = new SignUpPage(driver);
	SUPage.txtPhone.sendKeys("12345678");
	SUPage.txtName.sendKeys("aaaadsd");
	SUPage.txtMail.sendKeys("annnnn@gmail.com");
	SUPage.txtPass.sendKeys("anhd567sgfdggg");
	
	SUPage.Fmonth.click();
	SUPage.ChonMonth.click();
	
	/*SUPage.FDay.click();
	SUPage.ChonDay.click();
	SUPage.FYear.click();
	SUPage.ChonYear.click();
	*/
	//SUPage.FBtnSignUp.click();
	
	
	
    assertTrue( true );
    
}
}
