package practicee;

public class Upcastingchild extends Upcastingnew{
	public void mom() {
		
		System.out.println("pqrs");
	}
	
	

	public static void main(String[] args) {
		Upcastingnew n= new Upcastingchild();
		n.dad();
		
		
		
	}

}



//Un upcasting if the method is overriden then it will call the childs syntax
//Un upcasting if the method is not overriden then it will call parents method
