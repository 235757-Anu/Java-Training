package sept21;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Character");
		Scanner s=new Scanner(System.in);
		char ch;
		ch=s.next().charAt(0);
		int a=ch;
		System.out.println("ASCII value is "+a);
	}

}
