package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	 WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By username=By.id("username");
	By password=By.id("password");
	By loginButton=By.id("Login");
	By signupButton=By.cssSelector("#signup_link");
	
	public WebElement getUsername()
	{
		return driver.findElement(username);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement clickLogin()
	{
		return driver.findElement(loginButton);
	}
	public WebElement clickSignupLink()
	{
		return driver.findElement(signupButton);
	}
	
}
