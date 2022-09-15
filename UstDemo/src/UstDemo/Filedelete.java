package UstDemo;
import java.io.File;

public class Filedelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("Example.txt");
		if(f.delete())
		{
			System.out.println(f.getName()+" Deleted");
		}
		else
		{
			System.out.println("Already Deleted");
		}

	}

}
