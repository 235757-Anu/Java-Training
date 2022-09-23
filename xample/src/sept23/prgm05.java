package sept23;
import java.util.*;
public class prgm05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Blue");
        c1.add("Green");
        c1.add("Yellow");
        c1.add("Orange");
        c1.add("Red");

 

 

       ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

 

 

       
        ArrayList<String> c3 = new ArrayList<String>();
        for (String e : c1)
           c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println(c3);

	}

}
