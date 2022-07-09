package practicee;

class Animal {
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Pig extends Animal {
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	}

	class Dog extends Animal {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	}

	class Main {
	public void cat(){
	    System.out.println("The cat says: meww");
	}
	public void cat(int a){
	    System.out.println("The cat dance"+" "+ a);
	}
	    
	    
	public static void main(String[] args) {
	    Main c= new Main();
	    c.cat();
	    c.cat(10);
	    
	    Animal myAnimal = new Animal();
	    Pig n= new Pig();
	    Dog m= new Dog();
	        
	    myAnimal.animalSound();
	    n.animalSound();
	    m.animalSound();
	    
	    
	    
	    class Animal {
	    	 int a=10;
	    	 public static void main(String[] args){
	    	   Animal n= new Animal();
	    	   System.out.println(n.a);
	    	     
	    	 }}
	  }
	}
