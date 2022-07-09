package practicee;

public class PalindromeString {

	public static void main(String[] args) { 
 
		String R= "madam";                               
		String reverse= "";
		for (int i= R.length()-1;i>=0;i--) 
		{
			
			reverse=  reverse+ R.charAt(i); 
		
		}
		System.out.println(reverse);	

		
		if(R.equalsIgnoreCase(reverse))
		{
		System.out.println("String is Palindrome");	
			
		}
		else {
			System.out.println("not a palindrome");
		}
	}
}
	
	


