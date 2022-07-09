package practicee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(500);
        
        //WebElement Username= driver.findElement(By.id("email"));
        //Username.sendKeys("mayuri@gmaill.com");
        
       // Thread.sleep(500);
        
       // WebElement Password= driver.findElement(By.id("pass"));
       // Password.sendKeys("Ranbir@495");
        Thread.sleep(500);

       // WebElement button= driver.findElement(By.name("login"));
        //button.click();
        
        WebElement create= driver.findElement(By.xpath("//a[text()='Create New Account' ]"));  
	     create.click();
	   // driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("myuri"); 
		   driver.findElement(By.name("firstname")).sendKeys("mayuri");
	 
	     WebElement radio= driver.findElement(By.xpath("//*[text()='Female']//following-sibling::input"));
	     //radio.click();
	     boolean output= radio.isSelected();
	     System.out.println(output);
}}

