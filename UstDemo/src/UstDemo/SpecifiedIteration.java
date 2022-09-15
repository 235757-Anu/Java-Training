package UstDemo;
import java.util.LinkedList;
import java.util.Iterator;


public class SpecifiedIteration {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
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
	        
	        Iterator itr = obj1.listIterator(5);

	        System.out.println("Numbers after specified position:");
	        while (itr.hasNext()) {
	          System.out.print(itr.next() + ",");
	        }
	      }
}
		
		
		
		
		
		
		
		/*int p;
		int data;
		LinkedList <Integer> list= new LinkedList <Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements to the Linked List");
		for(int i=0;i<4;i++)
		{
			data=s.nextInt();
			list.add(data);
		}
		
		System.out.println("Enter the POsition");
		p=s.nextInt();
		ListIterator it=list.listIterator(p-1);
		System.out.println("Element from Position"+p+":");
		while(it.hasNext())
		{
			System.out.println(it.next()+"");
		}

	}

}*/
