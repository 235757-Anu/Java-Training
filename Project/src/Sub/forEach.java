package Sub;

import java.util.Collections;
import java.util.LinkedList;
public class forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		Collections.reverse(l);
		l.forEach(i->System.out.println(i));
		

	}

}