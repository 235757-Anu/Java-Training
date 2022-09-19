package Java8;

import java.util.Random;

public class sortedrandom {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		random.ints(5,50,100).sorted().forEach(System.out::println);
	}
}