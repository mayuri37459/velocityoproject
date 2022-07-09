package Pomclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing {
WebDriver driver;
WebDriverWait wait;

@FindBy(xpath="//input[@id='txtUsername']")
private WebElement username;

@FindBy(xpath="//input[@id='txtPassword']")
private WebElement password;

@FindBy(xpath="//input[@id='btnLogin']")
private WebElement submitbutton;

public Testing (WebDriver driver)
{ 
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

public void clickusername() 
{
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtUsername']")));
	username.sendKeys("Admin");
	
	 wait= new WebDriverWait(driver, Duration.ofSeconds(10));

}

public void clickpassword() 
{
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtPassword']")));
	password.sendKeys("admin123");
	
	
}
public void clicksubmit() 
{
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='btnLogin']")));
	submitbutton.click();
	
}
}
