package Example;
import java.util.*;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Inmate's name:");
		String f=s.nextLine();
		System.out.print("Inmate's father's name:");
		String l=s.nextLine();
		f=f.concat(" ").concat(l);
		char[] c=f.toCharArray();
        for(char e:c)
		{
			if(Character.isDigit(e)|| e=='@'|| e=='#' ||e=='+'||e=='*' || e=='%'||e=='$'||e=='&'|| e=='('||e==')')
			{
				System.out.println("Invalid name");
				System.exit(0);
			}
		}
		
		System.out.println(f.toUpperCase());
		

	}

}
