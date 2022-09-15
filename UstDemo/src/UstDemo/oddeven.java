package UstDemo;
import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		int a,n,i;
		int odd=0,even=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		a=s.nextInt();
		while(a>0)
		{
			n=a%10;
			if(n%2==0)
			{
				even=even+n;
			}
			else
			{
				odd=odd+n;
			}
			a=a/10;
		}
		System.out.println("Sum of odd Number:"+odd);
		System.out.println("Sum of even Number:"+even);

	}

}
