package Sub;
interface printab{
	void print();
}
interface showab extends printab{
	void show();
}
class TestInterface4 implements showab{
	public void print()
	{
		System.out.println("Hello");
	}
	public void show()
	{
		System.out.println("World");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface4 obj=new TestInterface4();
		obj.print();
		obj.show();

	}

}
