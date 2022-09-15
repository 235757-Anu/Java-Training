package UstDemo;
import java.util.Scanner;

public class Fpattern {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int n,i,j;
			System.out.println("Enter the Number:");
			n=s.nextInt();
			
			for(i=1;i<n+1;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print(" * ");
				}
				System.out.println();
			}
			for(i=n-1;i>0;i--)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print(" * ");
				}
				System.out.println();
			}
			

	}

}
