package Sub;
interface Showable
{
	void show();
	interface Message
	{
		void msg();
	}
	
}
class TestInterface1 implements Showable.Message{
	
	public void msg() {
		System.out.println("Hello Interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Showable.Message message=new TestInterface1();
		message.msg();

	}

}
