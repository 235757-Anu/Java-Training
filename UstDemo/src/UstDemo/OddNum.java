package UstDemo;
import java.util.Scanner;

public class OddNum {

	public static void main(String[] args) {
		System.out.println("Enter the Age:");
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		if(a>=18)
		{
			System.out.println("Eligible for Vote");
		}
		else
		{
			System.out.println("Not Eligible for Vote");
		}

	}

}
