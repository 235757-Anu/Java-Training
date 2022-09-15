package UstDemo;

class Shape{
	void show4()
	{
		System.out.println("This is shape");
	}
}

class Rectangle extends Shape
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
class Circle extends Shape
{
	void show3()
	{
		System.out.println("This is Circular shape");
	}
}



public class Subclass {

	public static void main(String[] args) {
		Square s=new Square();
		s.show4();
		s.show1();
	}

}
