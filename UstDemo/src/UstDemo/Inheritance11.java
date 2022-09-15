package UstDemo;

class data
{
	int i;
	void printNum()
	{
		System.out.println(i);
	}
}

class subdata extends data
{
	int j;
	void printNum()
	{
		System.out.println(j);
	}
}
public class Inheritance11 {

	public static void main(String[] args) {
		subdata sd=new subdata();
		sd.i=30;
		sd.j=30;
		sd.printNum();

	}

}
