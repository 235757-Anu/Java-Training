package sept21;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=1,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial of a Number: "+f);

	}

}
