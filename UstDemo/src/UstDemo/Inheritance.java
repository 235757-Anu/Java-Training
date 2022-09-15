package UstDemo;

class Member
{
	String name;
	int age,Phno,salary;
	String address;
	void printSalary()
	{
		System.out.println("Enter the Salary");
	}
	void show()
	{
		System.out.println(name+" "+age+" "+Phno+" "+address+" "+salary+" ");
	}
}

class Employee extends Member
{
	String specialzation;
}

class Manager extends Member
{
	String department;
	
}
public class Inheritance {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.name="A";
		e.age=25;
		e.Phno=1234567890;
		e.address="xyz";
		e.salary=25000;
		e.show();
		
	    Manager m=new Manager();
		m.name="B";
		m.age=27;
		m.Phno=1230987765;
		m.address="pqr";
		m.salary=30000;
		m.show();
		

	}

}
