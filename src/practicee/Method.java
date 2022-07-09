package practicee;

public class Method 
{
	
	public static void mayu() 
	{                  //static method can overload in same class however 
												// can not override in same class
		System.out.println("My name is mayuri");
	}
	
	public static void mayu(int a) 
	{
		System.out.println(a);
	}

	public void niku()                    //nonstatic method can overload in same class however 
										// can not override in same class
	{
		System.out.println("my name is nikita");
	}
	public void niku(int a)
	{
		
	System.out.println(a);	
	}
	
	public static void main(String[] args) {
				mayu();
				mayu(10);
	Method	ref= new Method();
	ref.niku();
	ref.niku(30);
		
	}

}
