package Sub;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a="";
		System.out.println("Enter the String: ");
		String s=sc.next();
		String t=s;
		for(int i=s.length()-1;i>=0;i--)
		{
			a=a+s.charAt(i);
		}
		if(a.compareTo(t)==0)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}
