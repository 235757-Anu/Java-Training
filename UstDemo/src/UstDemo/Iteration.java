package UstDemo;
import java.util.LinkedList;


public class Iteration {
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
    
    for (String number :obj1) {
        System.out.println(number);
        }


	
	}
}	
	











/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data;
		LinkedList <Integer> list=new LinkedList <Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements to the Linked List");
		for(int i=0;i<4;i++)
		{
			data=s.nextInt();
			list.add(data);
		}
		System.out.println("The Linked List:");
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+"");
			
		}

	}

}*/
