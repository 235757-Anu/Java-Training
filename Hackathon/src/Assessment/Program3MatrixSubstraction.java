package Assessment;

import java.util.Scanner;

public class Program3MatrixSubstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows and columns:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		int b[][] = new int[m][n];
		int c[][] = new int[m][n];
		int i,j;
		System.out.println("\nEnter elements of first matrix:");
		for(i = 0; i < m; i++)
		{
			for(j = 0; j < n; j++)
			{
				a[i][j] = sc.nextInt();
		    }
		}
		System.out.println("\nEnter elements of second matrix:");
		for(i = 0; i < m; i++)
		{
			for(j = 0; j < n; j++)
			{
				b[i][j] = sc.nextInt();
		    }
		}
		System.out.println("\nSubstraction of two matrices is:");
		for(i = 0; i < m; i++)
		{
			for(j = 0; j < n; j++)
			{
			c[i][j] = a[i][j] - b[i][j];
			System.out.print(c[i][j] + " ");
			
			}
			System.out.print("\n");
		}

	}

}
