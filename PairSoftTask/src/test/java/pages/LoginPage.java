package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver)
	{
	this.driver=driver;
	}


	By userName = By.xpath("//input[@id='Username']");
	By password = By.xpath("//input[@id='Password']");
	By signIn = By.xpath("//button[@id='btnLogin']");


	public void loginFunctionality()
	{
	driver.findElement(userName).sendKeys("rsharma");
	driver.findElement(password).sendKeys("abc123$$$");
	driver.findElement(signIn).click();

	}

	//tr[@aria-rowindex='1']//td//div//span[1]
	
	
}
