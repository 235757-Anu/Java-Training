package DataStructure;


public class SingleLinkedList {
	class node{
		int data;
		node next;
		
		public node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public node head=null;
	public node tail=null;
	
	public void add(int data) {
		node NewNode=new node(data);
		
		if(head==null)
		{
			head=NewNode;
			tail=NewNode;
		}
		else
		{
			tail.next=NewNode;
			tail=NewNode;
		}
	}
	
	public void display()
	{
		node current=head;
		
		if(head==null)
		{
			System.out.println("The Linked List is empty");
			return;
		}
		System.out.println("The nodes of Linked List are: ");
		while(current!=null)
		{
			System.out.println(current.data + " ");
			current=current.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SingleLinkedList s=new SingleLinkedList();
		
		s.add(1);
		s.add(11);
		s.add(21);
		s.add(31);
		s.add(41);
		s.add(51);
		s.add(61);
		s.add(71);
		s.add(81);
		s.add(91);
		s.display();

		

	}

}
