package UstDemo;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[][],i,j;
		a=new int[10][10];
		System.out.println("Enter the Numbers:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
		      	a[i][j]=s.nextInt();
			}
		}
		System.out.println("The Array is:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		
	}

}
