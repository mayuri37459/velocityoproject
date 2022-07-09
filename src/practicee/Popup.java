package practicee;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
    
    WebDriver driver= new ChromeDriver();
    driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
    Thread.sleep(1000);
    
   WebElement submit= driver.findElement(By.xpath("//input[@type='submit']"));
    
    submit.click();
   Thread.sleep(1000);

    Alert submit1= driver.switchTo().alert();
    //submit1.accept();
    String s= submit1.getText();
    System.out.println(s);
    submit1.dismiss();
    
	}

}
