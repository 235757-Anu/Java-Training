package UstDemo;

class A
{
	void show()
	{
		System.out.println("This is Parent Class ");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("This is Child Class ");
	}
}

public class C {

	public static void main(String[] args) {
		A P=new A();
		B C=new B();
		A D=new B();
		P.show();
		C.show();
		D.show();
		
	}

}
