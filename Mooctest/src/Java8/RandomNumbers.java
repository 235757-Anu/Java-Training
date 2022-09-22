package Java8;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		random.ints(5,50,100).forEach(System.out::println);

	}

}
