package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkFlow {

	
	WebDriver driver;

	public WorkFlow(WebDriver driver)
	{
	this.driver = driver;
	}

	By workflowDropdown = By.xpath("//div[@class='btn-group workflownavigationchooseworkflowtext']//a//span[2]");
	By billAssociation = By.xpath("//li//a[contains(text(),'Bill Association')]");
	By chooseStep = By.xpath("//button[contains(text(),'Choose Step')]//span");
	By dataEntry = By.xpath("//ul//li[contains(text(),'Data Entry')]");



	public void workFlow()
	{
	driver.findElement(workflowDropdown).click();
	driver.findElement(billAssociation).click();
	driver.findElement(chooseStep).click();
	driver.findElement(dataEntry).click();

	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	
	
}
