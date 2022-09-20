package Sub;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int year;
		System.out.println("Enter a Year: ");
		year=s.nextInt();
		if(( year%4 == 0 && (year%100!=0)) || (year%400==0))
		{
			System.out.println("The Year is a Leap Year");
		}
		else
		{
			System.out.println("The Year is not Leap Year");
		}

	}

}
