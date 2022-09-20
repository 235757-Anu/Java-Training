package Sub;

import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first Number");
		int x=s.nextInt();
		System.out.println("Enter the second Number");
		int y=s.nextInt();
		System.out.println("Enter the third Number");
		int z=s.nextInt();
		if(x>y)
		{
			if(x>z)
			{
				System.out.println("The largest Number is: "+x);
			}
			else
			{
				System.out.println("The largest Number is: "+z);
			}
		}
		else if(x<y)
		{
			if(y>z)
			{
				System.out.println("The largest Number is: "+y);
			}
			else
			{
				System.out.println("The largest Number is: "+z);
			}
		}
		else
		{
			System.out.println();
		}

	}

}
