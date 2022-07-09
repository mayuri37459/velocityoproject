package testclass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Suitclass {
	
	@BeforeClass
	public void beforeclass(){
		
		System.out.println("my name is mayuri");
	}
	
	@BeforeMethod
	public void beforemethod(){
		
		System.out.println("yyyyy");
	}
	
	@Test (invocationCount=2)
	public void test(){
		
		System.out.println("zzzzzzz");
	}
	
	@AfterClass
	public void afterclass(){
		
		System.out.println("my name is mayuri");
	}

}
