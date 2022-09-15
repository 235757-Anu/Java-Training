package UstDemo;

import java.util.Scanner;

public class Sumproduct {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[],i,n,p=1,sum=0;
		System.out.println("Enter the Limit:");
		n=s.nextInt();
		a=new int[10];
		System.out.println("Enter the Numbers");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		for(i=0;i<n;i++)
		{
			p=p*a[i];
		}
		System.out.println("Sum of the Numbers :"+sum);
		System.out.println("Product of the Numbers :"+p);

	}

}
