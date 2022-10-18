package New;
import java.util.Arrays;
import java.util.*;

public class Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int n=s.nextInt();
		int[] a= new int[n];
		System.out.println("Enter the elemnts of Array:");
		for(int k=0;k<a.length;k++)
		{
			a[k]=s.nextInt();
		}
		System.out.println("Enter the Desired sum: ");
		int sum=s.nextInt();
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]==a[j])
					a[i]=a[j+1];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
				{
					count++;
					System.out.println("{"+a[i]+","+a[j]+"}");
					
				}
			}
		}
		System.out.println("Number of pairs is: "+count);

	}

}
