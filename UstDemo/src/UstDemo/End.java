package UstDemo;
import java.util.LinkedList;


public class End {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> obj1 = new LinkedList<String>();
		 
        obj1.add("One");
        obj1.add("Two");
        obj1.add("Three");
        obj1.add("Four");
        obj1.add("Five");
        obj1.add("Six");
        obj1.add("Seven");
        obj1.add("Eight");
        obj1.add("Nine");
        obj1.add("Ten");
        
        System.out.println("Linked list: "+obj1);
        obj1.offerLast("Seven");
        System.out.println("Updated Linked list: "+obj1);

	}

}
