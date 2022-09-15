package UstDemo;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Filewrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileWriter mywriter=new FileWriter("Example.txt");
			mywriter.write("Hello, ");
			mywriter.write("Welcome to the java course");
			mywriter.close();
			
			File obj=new File("Example.txt");
			Scanner myReader=new Scanner(obj);
			while(myReader.hasNextLine())
			{
				String data=myReader.nextLine();
				System.out.println(data);
				
			}
		}
		catch(Exception e) {
				System.out.println(e);
			}
		
	}

}
