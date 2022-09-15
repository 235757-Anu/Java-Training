package UstDemo;
import java.io.File;

public class File1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File obj=new File("Example.txt");
		try {
			boolean success=obj.createNewFile();
			if(success)
			{
				System.out.println("File got Created");
			}
			else
			{
				System.out.println("File already exists");
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
