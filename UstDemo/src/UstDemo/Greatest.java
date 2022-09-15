package UstDemo;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		System.out.println("Enter the first Number:");
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		System.out.println("Enter the second Number:");
		int b = s.nextInt();
		if(a>b)
		{
			System.out.println(a+" is greater than "+b);
			
		}
		else
		{
			System.out.println(b+" is greater than "+a);
			
		}

	}

}
