package practicee;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();

driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
Thread.sleep(1000);

//WebElement alert2= driver.findElement(By.xpath("(//a[contains(text( ), 'Try it Yourself ')])[4]"));
//WebElement prompt= driver.findElement(By.xpath("(//a[contains(text( ), 'Try it Yourself ')])[3]"));
//WebElement confirm= driver.findElement(By.xpath("(//a[contains(text( ), 'Try it Yourself ')])[2]"));
//WebElement alert= driver.findElement(By.xpath("(//a[contains(text( ), 'Try it Yourself ')])[1]"));

WebElement alert= driver.findElement(By.xpath("(//a[contains(text( ), 'Try it Yourself ')])[1]"));
 WebElement confirm= driver.findElement(By.xpath("(//a[contains(text( ), 'Try it Yourself ')])[2]"));
 WebElement prompt= driver.findElement(By.xpath("(//a[contains(text( ), 'Try it Yourself ')])[3]"));
 WebElement alert2= driver.findElement(By.xpath("(//a[contains(text( ), 'Try it Yourself ')])[4]"));

 alert.click();
 Thread.sleep(500);

 confirm.click();
 Thread.sleep(500);

 prompt.click();
 Thread.sleep(500);

 alert2.click();
 Thread.sleep(500);

 

String main= driver.getWindowHandle();
System.out.println(main);


ArrayList<String> add= new ArrayList<String>(driver.getWindowHandles());

/*for (int i=0; i<add.size(); i++)
{ String a= add.get(i);
 System.out.println(a);
 driver.switchTo().window(a);
 System.out.println(driver.getCurrentUrl());
	}
Thread.sleep(1000);
driver.switchTo().parentFrame(); */

driver.switchTo().window(add.get(4));
WebElement iframe= driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
driver.switchTo().frame(iframe);
 
 WebElement try1= driver.findElement(By.xpath("//html//button[contains(text(), 'Try it')]"));
try1.click();


Alert submit1= driver.switchTo().alert();
submit1.accept();
Thread.sleep(1000);
	}
}
