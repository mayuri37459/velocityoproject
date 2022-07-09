package practicee;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.navigate().to("https://jqueryui.com/position/");
		 //driver.manage().window().maximize();
		 Thread.sleep(1000);
		 
		 WebElement abc= driver.findElement(By.xpath("//a[text()='Widget Factory']"));      //find the element 
		 JavascriptExecutor j= (JavascriptExecutor)driver;                     //JavascriptExecutor is a interface in selenium
		 
		 j.executeScript("arguments[0].scrollIntoView(true);" , abc);          //this method scroll till particular element is found
		 Thread.sleep(1000);

		 //abc.click();                                                         //used to click on the element

		 
		 
		// j.executeScript("window.scrollBy(0,500)"); //scrolling up
		// Thread.sleep(600);

		// j.executeScript("window.scrollBy(0,-500)"); //scrolling down

		// j.executeScript("window.scrollBy(-500,0)"); //scrolling left

		// j.executeScript("window.scrollBy(500,0)"); //scrolling right

		 

		 

	}

}
