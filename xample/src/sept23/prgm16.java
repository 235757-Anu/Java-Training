package sept23;
import java.util.*;
public class prgm16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashset = new HashSet<String>();
		hashset.add("hello");
		hashset.add("world");
		hashset.add("hi");
		hashset.add("all");
		System.out.println(hashset);
		Set<String> hashtotree = new TreeSet<String>(hashset);
		System.out.println(hashtotree);

	}

}
