package practicee;

public class Reversealltypes {
	

		public static void main(String[] args) {
			String s= "I am Mayuri";
			String reverse = "";   				 // for reverse and palindrome
			String reversed = "";   				 // for revers each

			String [] split= s.split(" ");
			for (int i=s.length()-1; i>=0;i--)
			{
			 reverse= reverse+ s.charAt(i);
			}

			System.out.println(reverse);
			
			System.out.println("============");
			
			if(s.equals(reverse)) {  				 // for palindrome
				System.out.println("String is palindrome");
			}else
			{
				System.out.println("String is not palindrome");
			}
			
			System.out.println("===spliting for reverse each word");
			for (String e: split) {
				
				String r= "";

			for (int i= e.length()-1; i>=0;i--) {
				
					r=r+e.charAt(i);
				}
				
				reversed=  reversed+r+" ";
			}
			System.out.println(reversed);
			
		}

		
		
		
	}


