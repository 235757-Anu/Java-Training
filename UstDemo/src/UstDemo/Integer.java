package UstDemo;

class Print{
	void printint(int a,char c)
	{
		System.out.println(a+" "+c);
	}
	void printint(char c,int a)
	{
		System.out.println(c+" "+a);
	}
}
public class Integer {

	public static void main(String[] args) {
		Print p=new Print();
		p.printint(5, 'a');
		p.printint('a', 5);

	}

	public static int parseInt(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
