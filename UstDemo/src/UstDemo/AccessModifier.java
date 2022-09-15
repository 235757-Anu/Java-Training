package UstDemo;

class stu{
	public void print()
	{
		System.out.println("Access Specifier");
	}
	private String name;
	protected int roll;
	int id;
}

class student extends stu{
	
}


public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student stu=new student();
		stu.print();
		stu.roll=17;
		System.out.println(stu.roll);
		stu.id=5223593;
		System.out.println(stu.id);

	}

}
