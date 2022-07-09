package Pomclass;

	

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Bklogin 
{
		
		public WebDriver driver;
		public WebDriverWait wait;
	@FindBy(xpath="//input[@name='txtUsername']")
	 private WebElement username;

	@FindBy(xpath="//input[@name='txtPassword']")
	private WebElement password;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitbutton;

	public Bklogin(WebDriver driver1)
	{
		this.driver= driver1;
	PageFactory.initElements(driver1, this);
	wait= new WebDriverWait(driver1, Duration.ofSeconds(10));
    }


	public void sendusername()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='txtUsername']")));
        username.sendKeys("Admin");
		
	}

	public void sendpassword()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='txtPassword']")));
		password.sendKeys("admin123");
	}

	public void homelogin() 
	{ 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']")));
		submitbutton.click();
		
	}

}



