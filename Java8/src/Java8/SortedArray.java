package Java8;

import java.util.Arrays;

public class SortedArray {

	public static void main(String[] args) {
	
		int a[]= {81,45,67,33,99,5};
		Arrays.parallelSort(a);
		Arrays.stream(a).forEach(n->System.out.println(n+" "));

	}

}
