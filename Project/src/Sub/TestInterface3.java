package Sub;
interface printabl{
	void print();
}
interface show{
	void print();
}

class TestInterface3 implements printabl,show{
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface3 obj=new TestInterface3();

	}

}
