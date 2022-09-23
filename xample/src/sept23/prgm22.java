package sept23;
import java.util.PriorityQueue;
public class prgm22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();  
		 PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();  
		      
		 pq1.add(1);
		 pq1.add(2);
		 pq1.add(3);
		 pq1.add(4);
		 pq1.add(5);
		 pq1.add(6);
		 pq1.add(7);
		 pq1.add(8);
		 pq1.add(9);
		 System.out.println("Original Priority Queue: \n"+pq1);
		 System.out.println("The first element of the Queue: \n"+pq1.peek());

	}

}
