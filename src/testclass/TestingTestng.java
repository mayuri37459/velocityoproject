package testclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class TestingTestng {
	WebDriver driver;
	@BeforeClass
	public void beforeclass() {
	System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
	
		
		
	}

}
