package Com.hrms.lib;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import org.testng.Reporter;

import comhrms.utility.Log;


public class General extends Global
{
	public void openApplication()
	{
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium-JAR\\chrome Driver\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.navigate().to(url);
		 System.out.println("Application opened");
		 Reporter.log("Application opened");
		 Log.info("Application opened");
		 
	
	}
	public void closeApplication()
	{
		driver.close();
		System.out.println("Apllication closed");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("login completed");
		Reporter.log("login completed");
		 Log.info("login completed");
		 
		
		
	}
	public void enterFrame()
	{
		driver.switchTo().frame("rightMenu");
		System.out.println("entered into frame");
	}
	public void exitFrame()
	{
		driver.switchTo().defaultContent();
		System.out.println("exit from the frame");
	}
	public void logout() throws Exception
	{
		//driver.findElement(By.linkText(welpaul)).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
		//Thread.sleep(4000);
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		Reporter.log("logout completed");
		 Log.info("logout completed");
		
	}

	public void addnewEmp() throws InterruptedException
	{
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText(lpim))).perform();
		driver.findElement(By.xpath(link_addemp)).click();
		Thread.sleep(5000);
		System.out.println("mouse over completed");
		driver.switchTo().frame("rightMenu");	
		
		driver.findElement(By.name(oempfn)).sendKeys(empfname);
		driver.findElement(By.name(oempln)).sendKeys(emplname);
		driver.findElement(By.xpath(osave)).click();
		driver.switchTo().defaultContent();
		//System.out.println("New emp added");
		Reporter.log("New emp added");
		 Log.info("New emp added");
	}
	public void editEmp() throws InterruptedException
	{
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText(lpim))).perform();
		driver.findElement(By.xpath(emplist)).click();
		driver.switchTo().frame("rightMenu");
	    Thread.sleep(5000);
		driver.findElement(By.xpath(editemp1)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(btn_edit)).click();
		Thread.sleep(5000);
		System.out.println("edit started");
		driver.findElement(By.name(oempfn)).clear();
		driver.findElement(By.name(oempln)).clear();
		System.out.println("Employe edit succesfully");
		driver.findElement(By.name(oempfn)).sendKeys("dev");
		driver.findElement(By.name(oempln)).sendKeys("Nimmatota");
		driver.findElement(By.xpath(editsave)).click();
		System.out.println("Emp saved succussfully");
		driver.switchTo().defaultContent();
		
	}
	public void deleteEmp() throws InterruptedException
	{
		//driver.switchTo().frame("rightMenu");
		Select st=new Select(driver.findElement(By.name("loc_code")));
		st.selectByVisibleText(selectdrop);
		System.out.println("select successful");
		driver.findElement(By.name(searchdroptext)).sendKeys(empid);
		Thread.sleep(4000);
		driver.findElement(By.xpath(searchbtndrop)).click();
		System.out.println("clicked on search button");
		Thread.sleep(3000);
		driver.findElement(By.xpath(checkboxsdrop)).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(deletedrop)).click();
		System.out.println("deleted successfully");
		Reporter.log("deleted successfully");
		 Log.info("deleted successfully");
		//driver.switchTo().defaultContent();
	}
}

