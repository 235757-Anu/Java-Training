package xample;

import java.util.TreeSet;

//import xample.Integer;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <Integer> t = new TreeSet <Integer>();
		//Scanner s=new Scanner(System.in);
		//boolean check t.add(input.nextInt());
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);
		t.add(6);
		t.add(7);
		t.add(8);
		t.add(9);
		t.add(10);
		//System.out.println(t);
		System.out.println("The numbers less than 7:");
		for(int e:t)
		{
			if(e<7)
			{
				System.out.println(e);
			}
		}
		

	}



	}

