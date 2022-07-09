package practicee;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        Thread.sleep(500);
        
       WebElement email= driver.findElement(By.id("ap_email"));
        email.sendKeys("9767288746");
        
        WebElement button= driver.findElement(By.id("continue"));
        button.click();
        
        WebElement Password1= driver.findElement(By.xpath("//input[@type= 'password'  ]"));
        Password1.sendKeys("m9767288746");
        
        WebElement button1= driver.findElement(By.id("signInSubmit"));
        button1.click();
        
        WebElement login= driver.findElement(By.xpath("//*[text()='Account & Lists']"));
       // login.click();
      	 Actions a= new Actions(driver);
      	 a.moveToElement(login).perform();

        WebElement logout= driver.findElement(By.xpath("//a[@id='nav-item-signout']"));
        logout.click();
        
        WebElement createacc= driver.findElement(By.xpath("//a[contains(text(),'your Amazon account')]"));
        createacc.click();
      //input[@id="ap_customer_name"]
        
        WebElement country= driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
        country.click();
        
        List<WebElement> allelement = driver.findElements(By.xpath("//span[@class='a-dropdown-prompt']"));
        System.out.println(allelement);
        
        //Select s= new Select(country);
       
       // s.selectByVisibleText("Honduras +504");
        
	}

}
