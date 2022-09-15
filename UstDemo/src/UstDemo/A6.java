package UstDemo;
import java.util.HashSet;
import java.util.*;

public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(12);
		hs.add(23);
		hs.add(34);
		System.out.println("Hash Set elements is: "+hs);
		HashSet<Integer> s=new HashSet<Integer>();
		s=(HashSet)hs.clone();
		System.out.println("Cloned Hash set elements is:"+s);
		
		

	}

}
