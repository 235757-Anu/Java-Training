package UstDemo;

import java.util.Scanner;

public class column {

	public static void main(String[] args) {
		int n,i,j,k;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		n=s.nextInt();
		k=n;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k=k-1;
			}
			k=n;
			System.out.println();
			
		}

	}

}
