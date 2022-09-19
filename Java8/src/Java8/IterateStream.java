package Java8;

import java.util.Random;

public class IterateStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		r.ints().limit(5).forEach(System.out::println);

	}

}
