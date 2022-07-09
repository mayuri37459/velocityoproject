package practicee;

public class Uppercase {

	public static void main(String[] args) {
			String a= "mayuri fuke";
			char [] r= a.toCharArray();   //converts string to array
			  
      for (int i=0; i<=a.length()-1; i++)   //loop till the lenght of array
			
		{
			if (r[i]>='a' && r[i]<='z')       //compare each index value from character a to z
			{
				r[i]= (char)((int)r[i]-32);	  // M= (ASCII value of m)- 32 
				                               // M= 109-32=77 
			}
			
		}
      System.out.println(r);
	 
		 
		 
}
}
