package UstDemo;

abstract class Animals
{
	public abstract void Cats();
	public abstract void Dogs();
}

class cat extends Animals 
{
	public void Cats()
	{
		System.out.println("Cats meow");
	}

	@Override
	public void Dogs() {
		// TODO Auto-generated method stub
		
	}
}

class dog extends Animals 
{
	public void Dogs()
	{
		System.out.println("Dogs bark");
	}

	@Override
	public void Cats() {
		// TODO Auto-generated method stub
		
	}
}

public class Abstract2 {

	public static void main(String[] args) {
		cat c=new cat();
		dog d=new dog();
		c.Cats();
		d.Dogs();

	}

}
