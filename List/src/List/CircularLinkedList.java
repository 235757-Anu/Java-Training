package List;

import List.SingleLinkedList.node;

public class CircularLinkedList {
	
	class node{
		int data;
		node next;
		
		public node(int data)
		{
			this.data=data;
			
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
			NewNode.next=head;
		}
		else
		{
			tail.next=NewNode;
			tail=NewNode;
			tail.next=head;
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
		do{
			System.out.println(current.data + " ");
			current=current.next;
		}while(current!=head);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularLinkedList s=new CircularLinkedList();
		
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
