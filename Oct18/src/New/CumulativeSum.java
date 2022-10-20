package New;
import java.util.Scanner;

public class CumulativeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int n=s.nextInt();
		if(n>0) {
		int a[] = new int[n];
		System.out.println("Enter the  elements");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
			System.out.print(sum+ " ");
		  }
		}
		else {
			System.out.println("Invalid Range");
		}


	}

}
