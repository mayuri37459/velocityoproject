package practicee;

public class Twointerface_class implements Twointerface_1, Twointerface {
	public void noun() 
	{
		System.out.println("This is noun");   //2 interface can implement each other can not 
	}										 // extends each other
	public void pronoun() 
	{
		System.out.println("This is pronoun");
	}
	public void adjective()
	{
		System.out.println("This is adjective");
	}
	public void conjuction()
	{
		
		System.out.println("This is conjuction");
	}
	
	
	public static void main(String[] args) {
		Twointerface_class ref3= new Twointerface_class();
		ref3.conjuction();
		ref3.noun();
		ref3.pronoun();
		ref3.adjective();
	}

}
