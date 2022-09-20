package Sub;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		double sq;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		sq=Math.sqrt(n);
		if((sq - Math.floor(sq))==0)
		{
			System.out.println("Perfect Square");
		}
		else
		{
			System.out.println("Not Perfect Square");
		}

	}

}
