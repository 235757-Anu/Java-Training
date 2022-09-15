package UstDemo;

import java.util.LinkedList;
import java.util.ArrayList;
public class Append {
public static void main(String[] args) {
   
   LinkedList<String> obj1 = new LinkedList<String>();
 
        obj1.add("One");
        obj1.add("Two");
        obj1.add("Three");
        obj1.add("Four");
        obj1.add("Five");
        obj1.add("Six");
        obj1.add("Seven");
        obj1.add("Eight");
        obj1.add("Nine");
        obj1.add("Ten");
        
        System.out.println("The linked list: " +obj1);
}
}











/*package UstDemo;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.*;

public class Append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data,newdata;
		LinkedList <Integer> list=new LinkedList <Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements Linked List");
		for(int i=0;i<4;i++)
		{
			data=s.nextInt();
			list.add(data);
		}
		System.out.println("The linked LIst");
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+"");
		}
		System.out.println("Enter the new element");
		newdata=s.nextInt();
		list.addLast(newdata);
		
		System.out.println("The new Linked List");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+"");
		}
	}

}*/