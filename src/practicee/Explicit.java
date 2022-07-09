package practicee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	 driver.navigate().to("https://www.facebook.com/");

	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	
	WebElement button= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Create New Account']")));
	 button.click();
	 
}
}