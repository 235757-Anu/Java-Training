package UstDemo;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		System.out.println("Enter the first Number:");
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		System.out.println("Enter the second Number:");
		int b = s.nextInt();
		System.out.println("Enter the Third Number:");
		int c = s.nextInt();
		if(a<b && a<c)
		{
				System.out.println("The Smaller Number is:"+a);
		}
		else if(b<a && b<c)
		{
			System.out.println("The Smaller Number is:"+b);
		}
		else
		{
			System.out.println("The Smaller Number is:"+c);
		}
	}
}
