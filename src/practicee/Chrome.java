package practicee;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	
	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");   //getting path of driver by set method
	WebDriver driver = new ChromeDriver ();      //webdriver is parent class, so upcasting is done where method stucture is of parent and body is child
	//driver.get("https://www.amazon.com");       // launching browser

// we can also launch by navigate method
	
	driver.navigate().to("https://www.w3schools.com");
	//Thread.sleep(1000);
	//driver.navigate().back();
	//Thread.sleep(1000);

	//driver.navigate().forward();
	
	
	String a= driver.getCurrentUrl();
	String b= "https://www.w3schools.com/";
	
	System.out.println(a.equals(b));
	System.out.println(a);
	
	System.out.println(driver.getTitle());
	Dimension d= new Dimension(3000, 677);
	Point m = new Point (400, 500);
	driver.manage().window().maximize();
	Thread.sleep(100);

	driver.manage().window().minimize();
Thread.sleep(100);

	driver.manage().window().setSize(d);
	Thread.sleep(100);

	driver.manage().window().setPosition(m);
	
	
	driver.close();
	Thread.sleep(100);

	//driver.quit();
	
	}

}
