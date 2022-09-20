package Sub;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int x=s.nextInt();
		if(x<0)
		{
			System.out.println("The Number '"+x+"' is a Negative");
		}
		else if(x>0)
		{
			System.out.println("The Number '"+x+"' is a Positive");
		}
		else
		{
			System.out.println("The Number '"+x+"' is a neither positive or Negative");
		}

	}

}
