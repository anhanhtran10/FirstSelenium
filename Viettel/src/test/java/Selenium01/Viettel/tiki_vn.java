package Selenium01.Viettel;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tiki_vn {
	//su dung webDriver, mo trang lazada.vn o trang thai cua so to nhat(Maximize). 
	//kiem tra title cua trang web co phai la "Lazada Vietnam khong"
	//Neu dung mow trang dang nhap, neu khong chuyen sang tiki.vn
	
	WebDriver driver;

	@Test

	public void secondTestCase()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver= new ChromeDriver();
	loginPage loPage = new loginPage(driver);
		
		driver.get("https://www.lazada.vn/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
	//	loPage.Login.click();
		if(title.equals("Lazada Vietnam")) {
			WebElement btnDangnhap = driver.findElement(By.xpath("//div[@id=\"anonLogin\"]//a[@class=\"grey\"]"));
			btnDangnhap.click();
		}else {
			driver.navigate().to("https://tiki.vn/");
		}
	
	}
}
