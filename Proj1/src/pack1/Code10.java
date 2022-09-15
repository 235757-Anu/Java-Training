package pack1;
import java.util.*;

public class Code10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("n");
		pq.add("a");
		pq.add("u");
		pq.add("i");
		System.out.println("The elements in the queue is "+pq);
		System.out.println("Enter the elements to be added:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		pq.add(s);
		System.out.println(pq);

	}

}
