package Sub;

public class SwappingWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=15;
		System.out.println("Before Swapping");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("\nAfter Swapping");
		System.out.println("a= "+a);
		System.out.println("b= "+b);

	}

}
