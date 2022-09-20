package Sub;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="anu";
		String r="";
		System.out.println("The String is: "+s);
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		System.out.println("Reverse of a String is: "+r);
		
	}

}
