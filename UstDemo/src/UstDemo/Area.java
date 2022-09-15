package UstDemo;

class Measure
{
	void show(int l,int b)
	{
		System.out.println("Area of Rectangle: "+(l*b));
	}
	void show(int a)
	{
		System.out.println("Area of Rectangle: "+(a*a));
	}
}
public class Area {

	public static void main(String[] args) {
		Measure m=new Measure();
		m.show(4,5);
		m.show(7);
	}

}
