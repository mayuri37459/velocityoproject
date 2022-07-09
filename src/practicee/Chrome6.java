package practicee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome6 {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver= new ChromeDriver();
	        
	        driver.navigate().to("https://www.amazon.in");
	        Thread.sleep(200);
	        
	        driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();
	        Thread.sleep(200);
	        
	      /*  driver.findElement(By.xpath("//input[@type=\'email\']")).sendKeys("9767288746"); //xpath by attribute
	        Thread.sleep(200);

	        driver.findElement(By.xpath("//input[@id=\'continue\']")).click();
	        Thread.sleep(200);

	        driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys("9767288746");
	        Thread.sleep(200);
	        
	        driver.findElement(By.xpath("//input[@id=\'signInSubmit\']")).click();

	       */ 
	      //  driver.findElement(By.xpath( "//a[@id='createAccountSubmit']")).click();
	        Thread.sleep(200);

	       // driver.findElement(By.xpath( "//input[@type='text']")).sendKeys("mayuri fuke");

	        driver.findElement(By.xpath( "//a[contains(@id,'Submit')]")).click();
	        Thread.sleep(200);

	        driver.findElement(By.xpath( "//input[contains(@type,'text')]")).sendKeys("mayuri fuke");
	        Thread.sleep(200);

	        driver.findElement(By.xpath( "//input[contains(@type,'tel')]")).sendKeys("9767288746");
	        Thread.sleep(200);

	        driver.findElement(By.xpath("//div[@class=\"a-row a-spacing-micro\"]//input")).sendKeys("mayurifuke@gamil.com");
	        Thread.sleep(200);

	        
	        driver.findElement(By.xpath("//div[@class=\"auth-require-fields-match-group\"]//input")).sendKeys("ranbir");
	        Thread.sleep(200);
	        
	        driver.findElement(By.xpath("//div[@class=\'a-section a-spacing-extra-large ap_mobile_number_fields\']")).click();

}}