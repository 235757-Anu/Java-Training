package UstDemo;

import java.util.Iterator;
import java.util.TreeSet;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t = new TreeSet<String>();
		t.add("Blue");
		t.add("Green");
		t.add("Yellow");
		t.add("Orange");
		t.add("Red");
		Iterator<String> i=t.descendingIterator();
		while(i.hasNext())
			System.out.println(i.next()+" ");

	}

}
