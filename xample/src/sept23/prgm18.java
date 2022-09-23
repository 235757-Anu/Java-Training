package sept23;
import java.util.*;
public class prgm18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<String>();
		String[] str = {"A","B","C","D","E","F" };
		s.addAll(Arrays.asList(str));
		System.out.println(s);
		s.clear();
		System.out.println(s);

	}

}
