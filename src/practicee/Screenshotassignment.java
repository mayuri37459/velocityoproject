package practicee;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Screenshotassignment {
	
	
static WebDriver driver;

	static void screenshot() throws IOException {                                    //TakesScreenshot is a interface in selenium 
		int i=0;                                                                     //file is class in
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);    //taken the screenshot by getScreenshotAs, which
		                                                                            //is method in selenium
		File dest= new File("F:\\Screenshot1\\img"+i+""+time()+".Jpg");             //give the destination location 
		FileHandler.copy(source, dest);                                             //copy the source into destination by FileHandler.copy
		i++;
	}
	
	public static String time() {         

		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
public static void main(String[]args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();
	 
	 
	driver.navigate().to("https://www.facebook.com/");
	 Thread.sleep(2000);
	 screenshot();
	 
	 
	 
	 driver.navigate().to("https://www.amazon.in/");
	 
	 WebElement SignIn= driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	 Thread.sleep(2000);
	 Actions act= new Actions(driver);
	 act.contextClick(SignIn).perform();
	 
	 driver.navigate().to("https://demoqa.com/droppable/");
	 Thread.sleep(2000);

	 WebElement s = driver.findElement(By.xpath("//div[@id='draggable']"));
	 Thread.sleep(2000);

	 WebElement d= driver.findElement(By.xpath("//div[@id='droppable']"));
	 Thread.sleep(2000);

	 Actions a= new Actions(driver);
	 a.dragAndDrop(s, d).perform();
	 
	 
	 
}

}

