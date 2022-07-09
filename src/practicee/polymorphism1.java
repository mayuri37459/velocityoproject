package practicee;

public class polymorphism1 {
	
	public void niku() {
		System.out.println("niku is tensed");
	}
	public void niku(int a) {
		System.out.println("niku having 10 chocolates");
	}
public static void main(String[] args) {
	polymorphism1 n= new polymorphism1();
	n.niku();
	n.niku(10);
	
}
}
