package practicee;

public class methodinheritance extends Method {
	
	public static void mayu() {
		System.out.println("mayuri");
	}
	public void niku() {
		System.out.println("nikita");
	}

	public static void main(String[] args) {

		methodinheritance ref1= new methodinheritance();
		ref1.niku();
		ref1.niku(20);
		ref1.mayu();
		ref1.mayu(49);
	}

}
