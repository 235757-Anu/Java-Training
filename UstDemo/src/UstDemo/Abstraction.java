package UstDemo;

abstract class fl
{
	public void a()
	{
		System.out.println("abc");
	}
	public abstract void b();
	public abstract void c();
}

abstract class D extends fl{
	public void b()
	{
		System.out.println("bcd");
	}
}

class E extends D{
	public void c()
	{
		System.out.println("cde");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D cc=new E();
		cc.a();
		cc.b();
		cc.c();

	}

}
