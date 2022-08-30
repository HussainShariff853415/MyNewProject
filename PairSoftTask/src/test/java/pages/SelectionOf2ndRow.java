package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectionOf2ndRow {

	WebDriver driver;
	
	public SelectionOf2ndRow(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By select2ndRow = By.xpath("//tr[@aria-rowindex='1']//td//div//span[1]");
	By mouseHoverOnButton = By.xpath("//button[contains(text(),' Keyed (1) ')]");
	
	
	
	
	
	
	public void selecting2ndRow()
	{
		driver.findElement(select2ndRow).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void mouseHover()
	{
		
		WebElement keyedButton = driver.findElement(mouseHoverOnButton);
		Actions actions = new Actions(driver);
		actions.moveToElement(keyedButton);
		
		
	}
	
	
	
}
