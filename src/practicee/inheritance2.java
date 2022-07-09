package practicee;

class inheritance2 extends Inheritance{
	private String dance= "Katthak";
	private static int a=10;
	public void songs() {
		System.out.println("bollywood songs");
	}
	public static void main(String[] args) {
		inheritance2 n= new inheritance2();
		n.action();
		n.songs();
		
		System.out.println(n.Movie+" "+ n.dance + " "+ inheritance2.a);
	}

}
