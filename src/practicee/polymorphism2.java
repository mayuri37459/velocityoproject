package practicee;

public class polymorphism2 extends polymorphism1 {
	
	public void niku(int d, int c) {
		
		System.out.println("niku is having 20 chocolates and 30 icecream"+ d+ c );
	}
	public static void main(String[] args) {
		polymorphism2 m= new polymorphism2();
		m.niku(20, 30);
		m.niku(40);
		m.niku();
		
	}

}
