package Sub;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first Number");
		int x=s.nextInt();
		System.out.println("Enter the second Number");
		int y=s.nextInt();
		System.out.println("Enter the third Number");
		int z=s.nextInt();
		int temp=x<y?x:y;
		int sm=temp<z?temp:z;
		System.out.println("The smallest Number is: "+sm);

	}

}
