package pack1;
import java.util.*;
import java.util.HashSet;

public class Code6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		hs.add(1);
		hs.add(12);
		hs.add(23);
		hs.add(34);
		System.out.println("Hash Set elements is: "+hs);
		LinkedHashSet<Integer> s=new LinkedHashSet<Integer>();
		s=(LinkedHashSet)hs.clone();
		System.out.println("Cloned Hash set elements is:"+s);

	}

}
