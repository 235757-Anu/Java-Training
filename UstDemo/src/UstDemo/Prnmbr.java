package UstDemo;

class PrintNumber
{
	void printn(int a)
	{
		System.out.println(a);
		
	}
	void printn(double a)
	{
		System.out.println(a);
	}
}

public class Prnmbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintNumber pn=new PrintNumber();
		pn.printn(9);
		pn.printn(7.5);

	}

}
