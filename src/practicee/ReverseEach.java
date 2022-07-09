package practicee;

public class ReverseEach {

	public static void main(String[] args) {
 
		String s= "Welcome to Java";
		String revs= "";
		String[] split= s.split(" ");
		
		for (String e: split)                     // welcome
			                                       //to
			                                        //java
		{ 		String word= "";

			for (int i= e.length()-1; i>=0;i--) 
			{
				word= word+ e.charAt(i);
			}
			
				revs= revs+word+" ";
			
		}
		System.out.println(revs);
	}

}
