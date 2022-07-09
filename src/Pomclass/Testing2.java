package Pomclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing2 
{
WebDriver driver;
WebDriverWait wait;

@FindBy(xpath="//*[text()='Admin']")
WebElement admin;

@FindBy(xpath="//*[text()='PIM]']")
WebElement pim;

public Testing2(WebDriver driver) 
{
 this.driver= driver;
 PageFactory.initElements(driver, this);
 wait= new WebDriverWait(driver, Duration.ofSeconds(10));
}

public void adpage() 
{wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Admin']")));
 admin.isDisplayed();
}

public void homepim()
{
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='PIM]']")));
pim.isDisplayed();
}
}
