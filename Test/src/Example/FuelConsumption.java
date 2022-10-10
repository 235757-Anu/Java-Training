package Example;
import java.util.Scanner;

public class FuelConsumption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of litres to fill the tank");
		double l=s.nextInt();
		if(l<=0)
		{
			System.out.println(l+" is an invalid input");
		}
		else
		{
			System.out.println("Enter the distance covered");
			double d=s.nextInt();
	         if(d<=0) {
	        	 System.out.println(d+" is an invalid input");
	         }
	         else {
		System.out.println("Liters/100KM");
		double c=(l/d)*100;
		System.out.println(String.format("%.2f",c));
		System.out.println("Miles/gallons");
		double m=(d*0.6214);
		double g=(l*0.2642);
		double n=(m/g);
		System.out.println(String.format("%.2f",n));
		}
		}

	}

}
