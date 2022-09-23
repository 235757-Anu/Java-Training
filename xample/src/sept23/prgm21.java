package sept23;
import java.util.PriorityQueue;
public class prgm21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PriorityQueue<String> pq = new PriorityQueue<String>();  
		  pq.add("A");
		  pq.add("B");
		  pq.add("C");
		  pq.add("D");
		  pq.add("E");
		  System.out.println("Elements of the Priority Queue: ");
		  
		  for (String element : pq) {
		    System.out.println(element);
		    }

	}

}
