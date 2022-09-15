package UstDemo;

import java.util.Scanner;

public class rows {

	public static void main(String[] args) {
		int n,i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
	}

}
