package Java8;

import java.util.Comparator;
import java.util.stream.Stream;

public class HighestLowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer highest=Stream.of(1,54,25,72).max(Comparator.comparing(Integer::valueOf)).get();
		Integer lowest=Stream.of(1,54,25,72).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("The highest Number is: "+highest);
		System.out.println("The lowest Number is: "+lowest);

	}

}
