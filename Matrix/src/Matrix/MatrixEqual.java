package Matrix;

import java.util.Scanner;

public class MatrixEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows and columns:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		int b[][] = new int[m][n];
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
		int r1,r2,c1,c2;
        int flag=0;
        r1=a.length;
        c1=a[0].length;
        r2=b.length;
        c2=b[0].length;
        if(r1!=r2 || c1!=c2)
        {
            System.out.println("no equal");
        }
        else
        {
            for(int d=0;d<r1;d++) 
            {
                for(int e=0;e<c1;e++)
                {
                    if(a[d][e]!=b[d][e]) {

                        flag=1;
                        break;
                    }

                }
        }

        if(flag==0)
        {
            System.out.println("Matrix are equal");
        }
        else
        {
            System.out.println("Matrix are not equal");
        }

    }

	}
}
