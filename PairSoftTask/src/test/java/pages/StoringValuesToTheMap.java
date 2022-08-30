package pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StoringValuesToTheMap {
	
	
	
	WebDriver driver;
	public StoringValuesToTheMap(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By IDColumn = By.xpath("(//tr[@aria-rowindex='1']//td//span)[3]");
	By createdColumn = By.xpath("//tr[@aria-rowindex='1']//td[6]");
	By stepColumn = By.xpath("//tr[@aria-rowindex='1']//td[7]");
	By ownerColumn = By.xpath("//tr[@aria-rowindex='1']//td[8]");
	By batchColumn = By.xpath("//tr[@aria-rowindex='1']//td[9]");
	By filenameColumn = By.xpath("//tr[@aria-rowindex='1']//td[10]");
	By filesize = By.xpath("//tr[@aria-rowindex='1']//td[11]");
	
	
	public void getDataAndStoreInAMap()
	{
		String ID = driver.findElement(IDColumn).getText();
		String created = driver.findElement(createdColumn).getText();
		String Step = driver.findElement(stepColumn).getText();
		String owner = driver.findElement(ownerColumn).getText();
		String batch = driver.findElement(batchColumn).getText();
		String fileName = driver.findElement(filenameColumn).getText();
		String filesizee = driver.findElement(filesize).getText();
				
		
		
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("ID", ID);
		map.put("Created", created);
		map.put("Step", Step);
		map.put("Owner", owner);
		map.put("Batch", batch);
		map.put("FileName", fileName);
		map.put("Filesize", filesizee);
		
		
		for(Map.Entry m : map.entrySet())
		{
			
			System.out.println(m.getKey() + " " + m.getValue());
			
			
		}
	}
	

}
