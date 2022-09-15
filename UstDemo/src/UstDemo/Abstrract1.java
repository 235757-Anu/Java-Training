package UstDemo;

abstract class Parent 
{
	public abstract void message();
}
class Subs extends Parent{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is first subclass");
	}
	
	
	
}

class Sub extends Parent{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is Second subclass");
	}
	
	
	
}



public class Abstrract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Subs();
		Parent pp=new Sub();
		p.message();
		pp.message();
	}

}


