package practicee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(500);
      
        driver.navigate().to("https://demoqa.com/droppable/");

   	 WebElement s = driver.findElement(By.xpath("//div[@id='draggable']"));

   	 WebElement d= driver.findElement(By.xpath("//div[@id='droppable']"));

   	 Actions a= new Actions(driver);      //Actions is a class in selenium
   	 a.dragAndDrop(s, d).perform();     //drag and drop   
     //a.click();                       //left click
    //a.contextClick();                 //right click
   //a.moveToElement(d).contextClick().build().perform();    //1.movetoelement used for hovering 2.mouse used perform for
   	                                                         //completing action 3. build is used when 2 methods perform together
     
	}

}

