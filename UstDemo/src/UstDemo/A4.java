package UstDemo;

import java.util.Iterator;
import java.util.TreeSet;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t = new TreeSet<String>();
		t.add("Blue");
		t.add("Green");
		t.add("Yellow");
		t.add("Orange");
		t.add("Red");
		Object F=t.first();
		System.out.println("First element is: "+F);
		Object L=t.last();
		System.out.println("Last element is: "+L);

	}

}
