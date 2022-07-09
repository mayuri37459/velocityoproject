package practicee;

	class interface4 implements interface1 {
	    
	    public void talk(){
	        System.out.println("I can talk");
	    }
	    public void walk(){
	                System.out.println("I can walk");
	        
	    }
	    
	    public static void main(String[] args){
	    	interface4 l= new interface4();
	l.talk();
	l.walk();
	    }
	    
	}