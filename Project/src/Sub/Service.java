package Sub;

import java.util.Scanner;

public class Service {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a;
		String m,s;
		System.out.println("Enter the Age: ");
		a=sc.nextInt();
		System.out.println("Sex(M/F): ");
		m=sc.next();
		System.out.println("Marital Status(Y/N): ");
		s=sc.next();
		if(m.equals("F"))
		{
			System.out.println("Works at Urban Areas");
		}
		else if(m.equals("M"))
		{
			if(a>=20 && a<40)
			{
				System.out.println("Works at Anywhere");
			}
			else if(a>=40 && a<=60)
			{
				System.out.println("Works at Urban Areas");
			}
			else
			{
				System.out.println("Error");	
			}
		}
		else
		{
			System.out.println("Error");
		}

	}

}
