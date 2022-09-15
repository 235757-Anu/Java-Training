package UstDemo;



class Shap{
	void show4()
	{
		System.out.println("This is shape");
	}
}

class Rectangle extends Shap
{
	void show1()
	{
		System.out.println("This is Rectangular shape");
	}
}
class Square extends Rectangle
{
	void show2()
	{
		System.out.println("Square is a Rectangle");
	}
}
class Circle extends Shap
{
	void show3()
	{
		System.out.println("This is Circular shape");
	}
}


public class Shape{

	public static void main(String[] args) {
		
		Square s=new Square();
		s.show4();
		s.show1();

	}

}
