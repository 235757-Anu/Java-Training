package xample;
import java.util.*;

public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <Integer> t=new TreeSet <Integer>();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);
		
		for(int e:t)
		{
			if(e<7)
			{
				System.out.println(e);
			}
		}

	}

}
