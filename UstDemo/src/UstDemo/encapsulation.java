package UstDemo;

class New
{
	private int roll;
	private String name;
	public int getRoll()
	{
		return roll;
	}
	public void setRoll(int roll)
	{
		this.roll=roll;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String Name)
	{
		this.name=Name;
	}
}
public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		New n=new New();
		n.setName("ABCD");
		n.setRoll(17);
		System.out.println(n.getName());
		System.out.println(n.getRoll());

	}

}
