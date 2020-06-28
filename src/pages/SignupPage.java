package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

	WebDriver driver;
	public SignupPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(name="UserFirstName")
WebElement firstName;

@FindBy(name="UserLastName")
WebElement lastName;

public WebElement getFirstName()
{
	return firstName;
}
public WebElement getLastName()
{
	return lastName;
}
}
