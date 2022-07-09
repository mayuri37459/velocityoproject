package Pomclass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority 
{
	@BeforeClass
	public void beforeclass()
	{ 
		System.out.println("beforeclass");
		
	}
	
	@BeforeMethod
	public void Method()
	{ 
		System.out.println("beforemethod");
		
	}
	
	
	@Test(priority=3, dependsOnMethods= {"test3","test1"}, timeOut=2000)
	public void test() throws InterruptedException
	{ 
		System.out.println("test");
		Thread.sleep(3000);
	}
	
	@Test(priority=1,invocationCount=3)
	public void test1()
	{ 
		System.out.println("test1");
		
	}
	@Test //(enable=false)
	public void test3()
	{ 
		System.out.println("test3");
		
	}
	
	
	@AfterMethod
	public void aftermethod()
	{ 
		System.out.println("aftermethod");
		
	}
	
	@AfterClass
	public void afterclass() {
		
		
		System.out.println("afterclass");
		
	}


}
