package UstDemo;

public class Factorial {

	public static void main(String[] args) {
		int n=4,i;
		long fact=1;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of 4 is:"+fact);

	}

}
