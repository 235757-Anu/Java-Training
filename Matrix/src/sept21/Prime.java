package sept21;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		int i,j,count;
		for(i=2;i<=n;i++)
		{
			count=0;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
		}
		
	}

}
