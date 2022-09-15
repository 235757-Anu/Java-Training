package UstDemo;

import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[],i,n,flag=0;
		a=new int[10];
		System.out.println("Enter the Numbers");
		for(i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter a number:");
		n=s.nextInt();
		for(i=0;i<10;i++)
		{
			if(a[i]==n)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("The number is Present");
		}
		else
		{
			System.out.println("The number is not Present");
		}

	}

}
