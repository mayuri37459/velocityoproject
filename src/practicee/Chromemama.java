package practicee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromemama {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://mamaearth.in");
		driver.navigate().forward();
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9767288746");
		
	}

}
