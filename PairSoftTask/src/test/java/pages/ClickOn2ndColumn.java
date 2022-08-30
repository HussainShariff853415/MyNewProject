package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClickOn2ndColumn {
	
	WebDriver driver;
	
	public ClickOn2ndColumn(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	
	By clickingSecondColumn = By.xpath("//tr[@aria-rowindex='1']//td//span[contains(text(),'47493')]");
	By textBox = By.xpath("//textarea[@id='txteventcommentdialog']");
	By closingButton = By.xpath("//div[@class='navigationbar']//div[@id='ejMenuBar_nav']//div[@class='e-icons e-popup-down-icon']");
	By closeButton = By.xpath("//button[@id='documentdialognavigationclose']//span");
	
	
	public void clickingTheID()
	{
		driver.findElement(clickingSecondColumn).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void enteringTheComments() throws InterruptedException
	{
	driver.findElement(textBox).sendKeys("Automation test");
	Thread.sleep(15000);
	}
	
	public void closingTheFormNow()
	{
		Actions action = new Actions(driver); 
		WebElement element = driver.findElement(closingButton);
		action.moveToElement(element).click();
		//driver.findElement(clickingSecondColumn).click();
		driver.findElement(closeButton).click();
	}
	
}
