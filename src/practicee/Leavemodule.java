package practicee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Leavemodule {
	WebDriver driver;
	@FindBy(xpath="//a[@id='menu_leave_viewLeaveModule']")
	WebElement leave;
	
	@FindBy(xpath="//input[@id='calFromDate']")
	WebElement from;
	
	@FindBy(xpath="//input [@id ='calToDate']")
	WebElement to;
	
	@FindBy(xpath="//input [@id ='leaveList_chkSearchFilter_2'*]")
	WebElement approval;

	@FindBy(xpath="//input [@id ='leaveList_txtEmployee_empName']")
	WebElement leaveEmployeename;

	@FindBy(xpath="//select [@id ='leaveList_cmbSubunit']")
	WebElement Subunit;
	
	@FindBy(xpath="//input [@id ='leaveList_cmbWithTerminated']")
	WebElement pastemployee;
	
	@FindBy(xpath="//input [@id ='btnSearch']")
	WebElement search;
	
		
	public Leavemodule( WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void leaveoption() 
	{
		leave.click();
	}
	
	public void leavefrome() 
	{
		from.sendKeys("2022-6-20");
		
	}
	
	public void leaveto() 
	{   to.clear();
		to.sendKeys("2022-6-30");
		
	}
	public void leaveapproavl() 
	{
		approval.click();
	}
	public void employee() 
	{
		leaveEmployeename.sendKeys("mayuri");	
	}
	public void leavesubunit() 
	{
		Select s= new Select(Subunit);
		s.selectByVisibleText("Finance");
	}
	
	public void leavepastemp() 
	{
		pastemployee.click();
	}
	
	public void leavesearch() 
	{
		search.click();
	}
	
	
}

