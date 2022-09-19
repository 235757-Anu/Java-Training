package Java8;
import java.util.*;

public class Squarefilter {

	public static void main(String[] args) {
		List <Integer> list=new ArrayList<>();
		list.add(4);
		list.add(5);
		list.add(9);
		list.add(11);
		list.add(15);
		OptionalDouble av=list.stream().mapToInt(i->i*i).filter(n->(n>100)).average();
		System.out.println("The average of Numbers is: "+av);
	}

}
