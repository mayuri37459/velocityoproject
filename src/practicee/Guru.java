package practicee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    
 driver.navigate().to("https://demo.guru99.com/popup.php");
  WebElement guru= driver.findElement(By.xpath("//a[text()='Click Here']"));
  guru.click();
  
    
    
	}

}
