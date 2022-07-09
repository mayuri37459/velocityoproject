package practicee;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
	 
 

public class Gettext {

	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();

driver.navigate().to("https://www.facebook.com/");
Thread.sleep(500);

WebElement s= driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
Thread.sleep(500);

String att=s.getAttribute("type");
System.out.println(att);
Thread.sleep(500);

WebElement login= driver.findElement(By.xpath("//button[@name='login']"));
String txt= login.getText();
System.out.println(txt);

String actual= "Log Inn";
if(txt.equals(actual)) 
{
	System.out.println("test case is passed");
	
}
else {
	System.out.println("test case failed");
}

	File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest= new File("F:\\Screenshot1\\img.Jpg");
	FileHandler.copy(source, dest);
	
		
	
}
	


	}


