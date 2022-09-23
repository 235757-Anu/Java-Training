package sept23;
import java.util.LinkedList;
public class prgm11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l = new LinkedList<String>();
        
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("E");
        
        System.out.println("The elements of LinkedList are: \n"+l);
        
       LinkedList<String> clone = (LinkedList<String>)l.clone();
       System.out.println("Cloned LinkedList: \n" + clone);

	}

}
