package Sorting;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {7,21,5,43,12,25};
		int n=5;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			if (a[i]==n)
			{
				System.out.println("The number found at position "+(i+1));
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("The number not Found");
		}

	}

}
