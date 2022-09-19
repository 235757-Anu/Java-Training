package Java8;

import java.util.List;
import java.util.ArrayList;

public class NumberOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("Hello");
		list.add("Haii");
		list.add("Welcome");
		list.add("Thanks");
		list.add("Hi");
		 long count=list.stream().filter(str->str.length() > 5).count();
		 System.out.println("We have "+count+" Strings greater than 5");

	}

}
