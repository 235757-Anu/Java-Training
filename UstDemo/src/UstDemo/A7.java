package UstDemo;

import java.util.*;
public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Integer> s=new HashSet <Integer>();
		Set <Integer> se=new HashSet <Integer>();
		Integer[] a= {21,23,32,45,56};
		s.addAll(Arrays.asList(a));
		System.out.println(s);
		Integer[] i= {21,23,32,45,56,67.81};
		se.addAll(Arrays.asList(i));
		System.out.println(se);
		System.out.println("The common elemnent is :");
		Set<Integer> sn=new HashSet(s);
		sn.retainAll(se);
		System.out.println(se);

	}

}
