package sept23;
import java.util.LinkedList;
public class prgm08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
  
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        int element1 = 2;
        int element2 = 4;
  
        System.out.println("Linked List Before Swapping :-");
  
        for (int i : ll) {
            System.out.println(i + " ");
        }
        int index1 = ll.indexOf(element1);
        int index2 = ll.indexOf(element2);
  
        
        if (index1 == -1 || index2 == -1) {
            System.out.println("no element found ");
            System.exit(0);
        }
            ll.set(index1, element2);
            ll.set(index2, element1);
       
        System.out.println("Linked List After Swapping :-");
        for (int i : ll) {
            System.out.print(i + " ");
        }

	}

}
