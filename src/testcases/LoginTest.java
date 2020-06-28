package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SignupPage;

public class LoginTest {
WebDriver driver;
	@Test
	public void loginTestCase() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\Browser drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		LoginPage lp=new LoginPage(driver);
		lp.getUsername().sendKeys("mohnani.anil@gmail.com");
		lp.getPassword().sendKeys("anil");
		lp.clickLogin().click();
		lp.clickSignupLink().click();
		SignupPage sp=new SignupPage(driver); 
		sp.getFirstName().sendKeys("Anil");
		sp.getLastName().sendKeys("kumar");
		
}
	
}
