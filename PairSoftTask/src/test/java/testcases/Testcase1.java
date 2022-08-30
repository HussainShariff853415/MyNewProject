package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.ClickOn2ndColumn;
import pages.LoginPage;
import pages.SelectionOf2ndRow;
import pages.StoringValuesToTheMap;
import pages.WorkFlow;

public class Testcase1 {
	
	WebDriver driver = new ChromeDriver();

	@Test(priority=1)
	public void loginToTheApplication() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver.get("https://psservices.app.cloud.papersave.com/workflow");
	//Thread.sleep(5000);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}

	
	
	@Test(priority=2)
	public void passDataInToIDPasswordFields()
	{
	LoginPage obj = new LoginPage(driver);
	obj.loginFunctionality();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}


	@Test(priority=3)
	public void workFlowFunctionality()
	{
		WorkFlow ob = new WorkFlow(driver);
		ob.workFlow();
		
		
	}
	
	
	
	@Test(priority=4)
	public void selectionOfSecondRow()
	{
		
		SelectionOf2ndRow obj = new SelectionOf2ndRow(driver);
		obj.selecting2ndRow();
		obj.mouseHover();
		
		
	}

	
	@Test(priority=5)
	public void clickOnSecondColumn() throws InterruptedException
	{
		ClickOn2ndColumn obj = new ClickOn2ndColumn(driver);
		obj.clickingTheID();
		obj.enteringTheComments();
		obj.closingTheFormNow();
		

	}
	
	@Test(priority=6)
	public void storeValues()
	{
		StoringValuesToTheMap obj = new StoringValuesToTheMap(driver);
		obj.getDataAndStoreInAMap();
	}
	
	
}
