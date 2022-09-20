package Sub;
import java.util.Scanner;
public class ReverseWord {

    public static String reverse(String str)
    {
        
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
            rev += str.charAt(i);
        return rev;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split("((?=\\\\.)|(?<=\\\\.)|(?=\\\\s)|(?<=\\\\s))");
        
        for(int i=0;i<arr.length;i++)
            System.out.println(reverse(arr[i])+" ");
		

	}

}
