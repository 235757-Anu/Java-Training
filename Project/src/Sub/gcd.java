package Sub;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first Number");
		int x=s.nextInt();
		System.out.println("Enter the second Number");
		int y=s.nextInt();
		int g=1;
		for(int k=1;(k<x&&k<y);k++)
		{
			if(x%k==0 && y%k==0)
			{
				g=k;
			}
		}
        System.out.println("GCD of two numbers is: "+g);
	}

}
