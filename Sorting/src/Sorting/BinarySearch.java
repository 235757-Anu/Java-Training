package Sorting;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {3,5,21,56,72,81,90};
		int n=72;
		int high=a.length-1;
		int low=0;
		int mid=(low+high)/2;
		while(high>=low)
		{
			if(a[mid]<n)
			{
				low=mid+1;
			}
			else if(a[mid]==n)
			{
				System.out.println("Element found at position "+(mid+1));
				break;
		    }
			else
			{
				high=mid-1;
			}
			mid=(low+high)/2;
		}
		if(low>high)
		{
			System.out.println("Element not Found");
		}

	}

}
