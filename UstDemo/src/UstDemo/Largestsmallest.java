package UstDemo;

import java.util.Scanner;

public class Largestsmallest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[],i,n,large=0,small=1000;
		System.out.println("Enter the Limit:");
		n=s.nextInt();
		a=new int[10];
		System.out.println("Enter the Numbers:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]>large)
			{
				large=a[i];
			}
		}
		for(i=0;i<n;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
		}
		System.out.println("The largest Number is "+large);
		System.out.println("The smallest Number is "+small);

	}

}
