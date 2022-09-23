package sept23;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class prgm09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        System.out.println("Actual LinkedList:\n"+list);
        List<String> list1 = new ArrayList<String>(list);
           
            System.out.println("Results after to array operation:\n" + list1);
      }

	}


