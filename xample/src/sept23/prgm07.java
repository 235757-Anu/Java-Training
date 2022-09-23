package sept23;
import java.util.LinkedList;
public class prgm07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> l1 = new LinkedList<String>();
	      l1.add("Good");
	      l1.add("Morning");
	      l1.add("All");
	      System.out.println("The list is defined as: \n" +l1);
	      l1.addFirst("Hi");
	      l1.addLast("!");
	      System.out.println("The list after adding elements is: \n" + l1);
	  

	}

}
