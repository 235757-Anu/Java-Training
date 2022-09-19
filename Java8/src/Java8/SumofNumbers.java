package Java8;

import java.util.ArrayList;
import java.util.List;

public class SumofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> list=new ArrayList<>();
		list.add(4);
		list.add(5);
		list.add(9);
		list.add(11);
		list.add(15);
		int sum=list.stream().mapToInt(i->i.intValue()).sum();
		System.out.println("The sum of Numbers is: "+sum);

	}

}
