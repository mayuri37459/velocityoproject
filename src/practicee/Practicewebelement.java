package practicee;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Practicewebelement {


	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver= new ChromeDriver();
  driver.get("https://kite.zerodha.com/");
  driver.navigate().to("https://kite.zerodha.com/");  // launch website
  driver.manage().window().maximize();
  Thread.sleep(1000);
  driver.manage().window().minimize();
  driver.manage().window().maximize();

  String a= driver.getCurrentUrl();
  String b= driver.getTitle();
  System.out.println(a);
  System.out.println(b);
  
  WebElement pass= driver.findElement(By.tagName("input"));
  Thread.sleep(1000);

  pass.sendKeys("tttt");

  WebElement login= driver.findElement(By.tagName("button"));
  Thread.sleep(1000);

  login.click();
  Thread.sleep(1000);

  File from= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  File to= new File("F:\\Screenshot1\\img.jpeg");
  FileHandler.copy(from, to);
  
  driver.navigate().to("https://jqueryui.com/position/");
  JavascriptExecutor j= ((JavascriptExecutor)driver);
  Thread.sleep(1000);

  j.executeScript("window.scrollBy(0,400)"); 
  driver.navigate().to("https://jqueryui.com/position/");
  WebElement element= driver.findElement(By.xpath("//a[text()='Position']"));



 j.executeScript("arguments[0].scrollIntoView(true);" , element);
  
  
  

  
 
	}

}
