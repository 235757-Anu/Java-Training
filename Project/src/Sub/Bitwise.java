package Sub;

import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first Number");
		int x=s.nextInt();
		System.out.println("Enter the second Number");
		int y=s.nextInt();
		System.out.println("Before Swapping "+x+" "+y);
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("After Swapping "+x+" "+y);

	}

}
