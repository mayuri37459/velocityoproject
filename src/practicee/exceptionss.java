package practicee;

public class exceptionss {

	public static void main(String[] args) {
int a=100;
int b=0;

	    try {
	      int c= a/b;
	      System.out.println("Rest of code in try block");
	    }

	    catch (ArithmeticException e) {
	      System.out.println("ArithmeticException => " + e.getMessage());
	    }
	  }
	}
