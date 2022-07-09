package testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pomclass.Bklogin;
import Pomclass.Homepage;
import Pomclass.Leavemodule;

public class Testclasststng 
{
	WebDriver driver;
	@BeforeClass
	public void beforeclass() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com");

	}
	 @BeforeMethod
	public void homepagelogin()
	{  Bklogin b= new Bklogin(driver);
		b.sendusername();
		b.sendpassword();
		b.homelogin();
	} 
	
	 @Test(priority=2)
	 public void homepageadmin()
	 {     Homepage h= new Homepage(driver);
	     h.homeadmin();
		 h.homeusername();
		 h.selector();
		 h.Homeemployee();
		 h.Employeestatus();
		 h.searchbutton();
		 
		 
	 }
	 
	 @Test(priority=1,invocationCount=3)
	 public void homepageleave()
	 {  Leavemodule l= new Leavemodule(driver);
	    l.leaveoption();
	    l.leavefrome();
	    l.leaveto();
	    l.leaveapproavl();
	    l.employee();
	    l.leavesubunit();
	    l.leavepastemp();
	    l.leavesearch();
		 
		 
	 }
	 
	
	@AfterMethod
	public void aftermethod()
	{
		Homepage h= new Homepage(driver);
        h.homeavtar();
        h.homelogout();
	}
	
	@AfterClass
	public void afterclass()
	{
      driver.quit();		
	}
	
	

}
