package practicee;

public class exceptionnew {

	public static void main(String[] args) {
int s=100;
int t=0;
try {
	
	int c= t/s;
	System.out.println(c);
}
catch(Exception e) {
	
	System.out.println("error occurs");
	e.printStackTrace();
}

finally {
	
	System.out.println("exit");
}
	}
	
	
	

}
