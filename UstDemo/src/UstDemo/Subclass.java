package UstDemo;

class Shape1{
	void show4()
	{
		System.out.println("This is shape");
	}
}

class r1 extends Shape1
{
	void show1()
	{
		System.out.println("This is Rectangular shape");
	}
}
class s1 extends r1
{
	void show2()
	{
		System.out.println("Square is a Rectangle");
	}
}
class c1 extends Shape1
{
	void show3()
	{
		System.out.println("This is Circular shape");
	}
}



public class Subclass {

	public static void main(String[] args) {
		s1 s=new s1();
		s.show4();
		s.show1();
	}

}
