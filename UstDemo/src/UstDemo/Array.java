package UstDemo;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[],i;
		a=new int[10];
		System.out.println("Enter the Numbers");
		for(i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("The Numbers are:");
		for(i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}


	}

}
