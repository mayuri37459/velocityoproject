package testclass;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

import Pomclass.Bklogin;
import Pomclass.Homepage;
import Pomclass.Leavemodule;
public class Testclass1 {

	
		
	public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
			
			Bklogin b = new Bklogin(driver);
			b.sendusername();
			b.sendpassword();
			b.homelogin();
			
			
			Homepage h= new Homepage(driver);
			
			 h.homeadmin();
			 h.homeusername();
			 
			 
			 Leavemodule l= new Leavemodule(driver);
			    l.leaveoption();
			    l.leavefrome();
			    l.leaveto();
			    l.leaveapproavl();
			    
				
	}}


