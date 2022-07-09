package practicee;

import java.io.IOException;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	static WebDriver driver;


	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
         driver= new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9767288746");
        Thread.sleep(2000);

        WebElement create= driver.findElement(By.xpath("//a[text()='Create New Account' ]")); 
        create.click();
        Thread.sleep(2000);

		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("mayuri");
	        Thread.sleep(2000);

	 /*    WebElement radio= driver.findElement(By.xpath("//*[text()='Female']//following-sibling::input"));
         // radio.click();
          Thread.sleep(2000);
          
    boolean output= radio.isSelected();
    System.out.println(output);
    if (output==true) 
    {
    	System.out.println("button by default clicked");
    }
    else {
    	radio.click();
    }
    
   // WebElement display= driver.findElement(By.xpath("//input[@type='radio' and @value='-1']"));
    //display.click();
    Thread.sleep(2000);
    

   // boolean output1= display.isDisplayed();
    //System.out.println(output1);
    
    WebElement enable= driver.findElement(By.xpath("//input[@name='custom_gender']"));
    boolean output3= enable.isEnabled();
  System.out.println(output3); */
  
  driver.navigate().to("https://www.instagram.com");
  Thread.sleep(2000);

  WebElement insta = driver.findElement(By.xpath("//button[@type='submit']")) ;
  Thread.sleep(2000);
boolean result= insta.isEnabled();
System.out.println(result);

driver.navigate().back();
Thread.sleep(2000);

WebElement create1= driver.findElement(By.xpath("//a[text()='Create New Account' ]")); 
create1.click();
//Screenshotassignment.screenshot();

Thread.sleep(2000);

WebElement date= driver.findElement(By.xpath("//select[@name='birthday_day']"));
Select date1= new Select(date);
date1.selectByValue("4");
Thread.sleep(2000);

WebElement month= driver.findElement(By.xpath("//select[@name='birthday_month']"));

Select month1= new Select(month);
month1.selectByIndex(6);
//Screenshotassignment.screenshot();

Thread.sleep(2000);


WebElement year= driver.findElement(By.xpath("//select[@name='birthday_year']"));
Select year1= new Select (year);
year1.selectByVisibleText("1995");
//Screenshotassignment.screenshot();

Thread.sleep(2000);

WebElement radio= driver.findElement(By.xpath("//*[text()='Female']//following-sibling::input"));
// radio.click();
 Thread.sleep(2000);
 
boolean output= radio.isSelected();
System.out.println(output);
if (output==true) 
{
System.out.println("button by default clicked");
}
else {
radio.click();
}

// WebElement display= driver.findElement(By.xpath("//input[@type='radio' and @value='-1']"));
//display.click();
Thread.sleep(2000);


// boolean output1= display.isDisplayed();
//System.out.println(output1);

WebElement enable= driver.findElement(By.xpath("//input[@name='custom_gender']"));
boolean output3= enable.isEnabled();
System.out.println(output3);



}

}
