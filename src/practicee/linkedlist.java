package practicee;


import java.util.*;

public class linkedlist {

	public static void main(String[] args) {
LinkedList m= new LinkedList();
m.add("mayuri");
m.add(100);
m.add(900);
m.add('n');

System.out.println(m);
for (Object e:m) {
	System.out.println(e);
}

System.out.println("=============================");
Iterator<Object> mn= m.iterator();
while(mn.hasNext()) {
	System.out.println(mn.next());
	
}
System.out.println("=========Tranversing elements using list Iterator");

ListIterator<Object> it= m.listIterator(); // mayuri 100 900 n

while (it.hasNext()) {
	
	System.out.println(it.next()); //

	System.out.println(it.next());


}
}
	}
