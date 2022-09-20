package Sub;

class Student
{        
	int rollno;        
	String name;        
	static String college = "ITS";        //static method to change the value of static variable        
	static void change()
	{       
		college = "IAM";        
	}       
	//constructor to initialize the variable        
	Student(int r, String n)
	{        
		rollno = r;        
		name = n;        
	}       
	//method to display values        
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
    }
}

public class TestStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student.change();//calling change method      
		 //creating objects      
		 Student s1 = new Student(1,"Karthika");      
		 Student s2 = new Student(2,"Nishad  ");       
		 Student s3 = new Student(3,"Niviya  ");      
		 //calling display method    
		 s1.display();     
		 s2.display();     
		 s3.display(); 

	}
}
