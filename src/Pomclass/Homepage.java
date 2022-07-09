package Pomclass;


	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class Homepage 
{
		public WebDriver driver;
		WebDriverWait wait;

	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']")
	private WebElement Admin;

	@FindBy(xpath="//input[@id='searchSystemUser_userName']")
	private WebElement Adminusername;

	@FindBy(xpath="//select[@id='searchSystemUser_userType']")
	private WebElement adminselector;

	@FindBy(xpath="//input[@id='searchSystemUser_employeeName_empName']")
	private WebElement Employeename;

	@FindBy(xpath="//select[@id='searchSystemUser_status']")
	private WebElement status;

	@FindBy(xpath="//input[@id='searchBtn']")
	private WebElement Search;
	
	@FindBy(xpath="//*[@id='welcome']")
	private WebElement Avtar;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	private WebElement logout;
			

	public Homepage(WebDriver driver2) 
	{
		this.driver= driver2;
		PageFactory.initElements(driver2, this);
		wait= new WebDriverWait(driver2, Duration.ofSeconds(20));

	}

	public void homeadmin() 
	{
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='menu_admin_viewAdminModule']")));

		Admin.click();
		
	}

	public void homeusername()
	{   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchSystemUser_userName']")));

		Adminusername.sendKeys("mayuri");	
		
	}

	public void selector() 
	{  Select s= new Select(adminselector);
	     s.selectByVisibleText("Admin");
	}

	public void Homeemployee() 
	{   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchSystemUser_employeeName_empName']")));
		Employeename.sendKeys("Mayurifuke");
	}

	public void Employeestatus() 
	{     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='searchSystemUser_status']")));

		Select e= new Select(status);
		e.selectByIndex(1);
		
	}

	public void searchbutton() 
		{   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchBtn']")));

		Search.click();
	}
	
	public void homeavtar() 
	{     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='welcome']")));

		Avtar.click();
	}
	
	public void homelogout() 
	
	{    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Logout')]")));

		logout.click();
	}
	
	
}


