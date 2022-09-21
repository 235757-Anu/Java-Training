package sept21;

import java.util.Scanner;

public class fibonocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		int f1=0,f2=1,f3;
		System.out.print(f1+" "+f2+" ");
		for(int i=2;i<n;i++)
		{
			f3=f1+f2;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
		}

	}

}
