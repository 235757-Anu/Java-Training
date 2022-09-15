package UstDemo;

import java.util.TreeSet;
import java.util.Iterator;

public class A2 {

	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		t.add("Blue");
		t.add("Green");
		t.add("Yellow");
		t.add("Orange");
		t.add("Red");
		Iterator<String> i=t.iterator();
		while(i.hasNext())
			System.out.println(i.next()+" ");


	}

}
