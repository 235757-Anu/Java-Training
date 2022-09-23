package sept23;
import java.util.Collections;
import java.util.LinkedList;
public class prgm10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("F");
        System.out.println("Actual LinkedList:\n"+linkedList);
        Collections.shuffle(linkedList);
        System.out.println("Results after shuffle operation:\n" + linkedList);      
      }

	}


