package practicee;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		
		List <WebElement> table= driver.findElements(By.xpath("//table[@id='customers']//tr//td"));
		
		for (int i=0; i<table.size(); i++)
		{
			WebElement td= table.get(i);
			String text= td.getText();
			System.out.println(text);
		}
		WebElement td= table.get(1);
		String text= td.getText();
		System.out.println(text);

		
	

}}
