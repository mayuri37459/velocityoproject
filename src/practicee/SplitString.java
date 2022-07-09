package practicee;

public class SplitString {

	public static void main(String[] args) {
		System.out.println("====Split string===");
  String a="RanbirisKapoor";
  String [] split= a.split("is");
  for(String e:split)
  { 
	  System.out.println(e);
	  
  }
System.out.println("====swap string");

	String a1=" mayuri";
	String a2= "fuke";

  	 System.out.println("String before swapping:" + a1+" "+ a2);

  		String b= a1;
  		a1=a2;

  	 System.out.println("String after swapping:"+ a1+ b);
  		
System.out.println("====swap without using third variable");	
  	
  	
  	String b1= "Ranbir";
  	String b2= "Kapoor";
  
  	 System.out.println("String before swapping:"+ b1+ " "+ b2 );
  	 
  	 b1=b1+b2;
  	 b2= b1.substring(0, b1.length()-b2.length());     //without using 3rd variable
  	 b1=b1.substring(b2.length());
  	 
  	 System.out.println("String after swapping:"+ b1+" "+ b2);
  	
  	 }

}
