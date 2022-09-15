package UstDemo;
import java.io.*;

public class ArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ptr=null;
		try
		{
			if(ptr.equals("abc"))
			{
				System.out.println("Same");
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception");
		}

	}

}
