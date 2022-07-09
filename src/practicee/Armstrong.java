package practicee;

public class Armstrong 
{

	public static void main(String[] args) 
	{
		int n=153; int sum=0, r=0; int temp=n;          //use temp=n to so that the initial number wont change later and we can compare it
		
		while(temp>0)
		{   r= temp%10;                //to get the reminder so that we can find cube of single digit
			temp= temp/10;             // to decrease the value of number
	     sum= sum + r*r*r;	           //sum= 0+ cube of the remainder we get by applying mod
		}
		if (sum==n)
		{	
			System.out.println("number is armstrong");
		}
			
		else
		{
		   System.out.println("number is not armstrong");
	
		}
	   //using for loop	
	    int m=1634; int l=0, z=0, temp1=m;
	
		for(int i=0;i<m;i++) 
		{
			l= temp1%10;
			temp1=temp1/10;
			z=z+l*l*l*l;	
		
		}
		  System.out.println(z);
	    if (z==m) 
	    {
		 System.out.println("numberrr is armstrong1");
	    }
	 else 
	   {
		 System.out.println("numberrr is not armstrong1");
	
	   }
	}
}
	
	
