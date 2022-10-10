package Example;
import java.util.*;

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the no of pizzas bought:");
		int p=s.nextInt();
		System.out.print("Enter the no of puffs bought:");
		int f=s.nextInt();
		System.out.print("Enter the no of cool drinks bought:");
		int c=s.nextInt();
		System.out.println("Bill Details");
		System.out.println("No of pizzas:"+p);
		System.out.println("No of puffs:"+f);
		System.out.println("No of cooldrinks:"+c);
		int t=((100*p)+(20*f)+(c*10));
		System.out.println("Total Price="+t);
		System.out.println("ENJOY THE SHOW!!!");
		

	}

}
