package sept23;
import java.util.*;
public class prgm04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> input_list = new ArrayList<String>();
         input_list.add("Hii");
         input_list.add("Hello");
         input_list.add("Welcome");
         input_list.add("Thanks");
         System.out.println("The list is defined as: \n" + input_list);
         Collections.sort(input_list);
         System.out.println("The sorted list is: \n" + input_list);

	}

}
