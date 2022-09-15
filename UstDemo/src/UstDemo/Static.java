package UstDemo;

class Am
{
	static void print()
	{
		System.out.println("Parent");
	}
}

class Bm extends Am
{
	static void print()
	{
		System.out.println("Child");
	}
}

public class Static {

	public static void main(String[] args) {
		Am a=new Am();
		Bm b=new Bm();
		Am obj=new Bm();
		a.print();
		b.print();
		obj.print();

	}

}
