package sept23;
import java.util.LinkedList;
public class prgm13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		  
        
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
  
       
        System.out.println("LinkedList:\n" + list);
  
       
        System.out.println("The first element is removed:\n" + list.removeFirst());
  
        
        System.out.println("Final LinkedList:\n" + list);

	}

}
